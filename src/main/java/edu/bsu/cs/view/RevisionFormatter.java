package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class RevisionFormatter extends Formatter {

    /*public String format(Revision revision) {
        return String.format("At %s, a change by %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
                revision.name);
    }*/
    @Override
    public String format(Revision revision) {
        try {
            return String.format("At %s, a change by %s",
                    date.parse(revision.timestamp.toString()),
                    revision.name);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
