public class WebSite
{
  private String url;
  private boolean userAccess;

  public WebSite(String url, boolean userAccess)
  {
    if (url.isBlank())
    {
      throw new IllegalStateException("Url cannot be blank");
    }
    this.url = url;
    this.userAccess = userAccess;
  }

  public String getUrl()
  {
    return url;
  }

  public void setAccess(boolean access)
  {
    this.userAccess = access;
  }

  public boolean hasAccess()
  {
    return userAccess;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    WebSite webSite = (WebSite) obj;
    return url.equals(webSite.url) &&
        userAccess == webSite.userAccess;
  }
}
