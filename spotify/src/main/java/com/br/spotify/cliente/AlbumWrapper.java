package com.br.spotify.cliente;

import java.util.List;

public class AlbumWrapper {

    private String href;

    private int limit;

    private String next;

    private int offset;

    private String previous;

    private int total;

    private List<Album> items;

    public AlbumWrapper() {
    }

    public AlbumWrapper(String href, int limit,
                        String next, int offset,
                        String previous, int total, List<Album> items) {
        this.setHref(href);
        this.setLimit(limit);
        this.setNext(next);
        this.setOffset(offset);
        this.setPrevious(previous);
        this.setTotal(total);
        this.setItems(items);

    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Album> getItems() {
        return items;
    }

    public void setItems(List<Album> items) {
        this.items = items;
    }

    
}
