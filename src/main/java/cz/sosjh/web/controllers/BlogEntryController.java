package cz.sosjh.web.controllers;

import cz.sosjh.web.model.BlogEntry;
import cz.sosjh.web.repository.BlogRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
public class BlogEntryController {

    @GetMapping(path = "/blog-entries/new", produces = MediaType.TEXT_HTML_VALUE)
    public String showAddBlogEntryPage(Model model) {
        model.addAttribute("entry", new BlogEntry());
        return "add-blog-entry";
    }

    @PostMapping(path = "/blog-entries")
    public String addBlogEntry(@ModelAttribute BlogEntry entry) {
        entry.setCreated(LocalDateTime.now());
        BlogRepository.add(entry);
        return "redirect:blog-entries/" + entry.getId();
    }

    @GetMapping(path = "/blog-entries/{blogEntryId}", produces = MediaType.TEXT_HTML_VALUE)
    public String getBlogEntry(@PathVariable("blogEntryId") Integer id,  Model model) {
        model.addAttribute("entry", BlogRepository.get(id));
        return "blog-entry";
    }
}
