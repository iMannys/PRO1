public class Administrator extends User
{
  public Administrator(String name)
  {
    super(name);
  }

  public void setUserAccessForSite(WebSite site)
  {
    SiteCollection siteCollection = super.getSiteCollection();

    for (int i = 0; i < siteCollection.getNumberOfSites(); i++)
    {
      WebSite webSite = siteCollection.getSite(i);
      if (webSite.equals(site))
      {
        boolean access = webSite.hasAccess();
        webSite.setAccess(!access);
      }
    }
  }

  public Administrator createAdministrator(User user)
  {
    Administrator administrator = new Administrator(user.getName());

    SiteCollection adminCollection = administrator.getSiteCollection();
    SiteCollection userCollection = user.getSiteCollection();

    for (int i = userCollection.getNumberOfSites() - 1; i >= 0; i--)
    {
      WebSite site = userCollection.getSite(i);
      site.setAccess(true);
      adminCollection.addSite(site);
      userCollection.removeSite(site.getUrl());
    }

    return administrator;
  }
}
