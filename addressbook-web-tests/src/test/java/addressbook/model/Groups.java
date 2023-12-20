package addressbook.model;

import com.google.common.collect.ForwardingSet;

import java.util.Set;


public class Groups extends ForwardingSet<GroupData> { //Расширенная версия множества

   private Set<GroupData> delegate;
    @Override
    protected Set<GroupData> delegate(){
        return delegate;
    }
}
