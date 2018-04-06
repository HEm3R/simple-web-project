package cz.sosjh.web.repository;

import cz.sosjh.web.model.BlogEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class BlogRepository {

    private static int sequenceId = 0;

    private BlogRepository() {
        // static repository, do not initialize
    }

    private static Map<Integer, BlogEntry> entries = new HashMap<>();

    public static void add(BlogEntry entry) {
        Integer id = sequenceId++;
        entry.setId(id);
        entries.put(id, entry);
    }

    public static List<BlogEntry> getAll() {
        return Collections.unmodifiableList(new ArrayList<>(entries.values()));
    }

    public static BlogEntry get(Integer id) {
        return entries.get(id);
    }
}
