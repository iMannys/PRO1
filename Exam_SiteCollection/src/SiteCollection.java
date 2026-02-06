public class SiteCollection
{
  private int size;
  private WebSite[] webSites;
  private static final int MAX_SITES = 25;

  public SiteCollection()
  {
    this.size = 0;
    this.webSites = new WebSite[MAX_SITES];
  }

  public int getNumberOfSites()
  {
    return size;
  }

  public void addSite(WebSite site)
  {
    webSites[size] = site;
  }

  public void removeSite(String url)
  {
    for (int i = 0; i < size; i++)
    {
      if (webSites[i].getUrl().equals(url))
      {
        webSites[i] = webSites[size-1];
        webSites[size-1] = null;
        size--;
        break;
      }
    }
  }

  public WebSite getSite(int index)
  {
    return webSites[index];
  }

  public boolean contains(WebSite site)
  {
    for (int i = 0; i < size; i++)
    {
      if (webSites[i].equals(site))
      {
        return true;
      }
    }
    return false;
  }
}
