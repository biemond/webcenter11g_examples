package nl.amis.wc.menu.filter;

import java.util.Hashtable;

import oracle.adf.rc.catalog.CatalogElement;
import oracle.adf.rc.spi.plugin.catalog.CatalogDefinitionFilter;

public class MenuFilter implements CatalogDefinitionFilter {
    public MenuFilter() {
        super();
    }

    public boolean includeInCatalog(CatalogElement catalogElement,
                                    Hashtable hashtable) {
         System.out.println(catalogElement.getId());
         if(catalogElement.getId().equals("Internal") )
                  return false;
         return true;
    }
}
