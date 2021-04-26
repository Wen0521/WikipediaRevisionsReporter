package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.RevisionFormatter;
import edu.bsu.cs.view.Formatter;

public class RevisionParser extends AbstractModule{
    @Override
    protected void configure() {
        bind(Formatter.class).to(RevisionFormatter.class);
    }

}
