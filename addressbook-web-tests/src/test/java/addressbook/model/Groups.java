package addressbook.model;

import java.util.Set;


public class Groups extends ForwardingSet<GroipData>{ //Расширенная версия множества

   private Set<GroupData> delegate;
    @Override
    protected Set<GroupData> delegate(){
        return delegate;
    }
}
