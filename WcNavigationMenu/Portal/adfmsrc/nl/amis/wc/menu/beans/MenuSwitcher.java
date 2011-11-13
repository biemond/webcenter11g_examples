package nl.amis.wc.menu.beans;

import oracle.adf.controller.ControllerContext;

public class MenuSwitcher {
    public MenuSwitcher() {
    }

    private String menu = null;


    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
      
      String currentView = ControllerContext.getInstance().getCurrentViewPort().getViewId();
      if ( "/oracle/webcenter/portalapp/pages/Internal.jspx".equalsIgnoreCase(currentView) ) {
         return "/oracle/webcenter/portalapp/navigations/navigationModelInternal.xml";
      } else if ( "/oracle/webcenter/portalapp/pages/External.jspx".equalsIgnoreCase(currentView)) {
         return "/oracle/webcenter/portalapp/navigations/navigationModelExternal.xml";
      }
      return "/oracle/webcenter/portalapp/navigations/default-navigation-model.xml";
    }
}
