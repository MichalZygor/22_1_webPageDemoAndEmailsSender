package pl.javastart.webPageDemoAndEmailsSender;

public class WebPagePart {
    private WebPageList pageList;
    private String headTitle;
    private String headDescription;
    private String footerText;
    private String bodyTitle;
    private String bodyContent;

//    public WebPagePart() {
//    }

    public WebPagePart(WebPageList pageList, String headTitle, String headDescription, String footerText, String bodyTitle, String bodyContent) {
        this.pageList = pageList;
        this.headTitle = headTitle;
        this.headDescription = headDescription;
        this.footerText = footerText;
        this.bodyTitle = bodyTitle;
        this.bodyContent = bodyContent;
    }

    public WebPageList getPageList() {
        return pageList;
    }

    public void setPageList(WebPageList pageList) {
        this.pageList = pageList;
    }

    public String getHeadTitle() {
        return headTitle;
    }

    public void setHeadTitle(String headTitle) {
        this.headTitle = headTitle;
    }

    public String getHeadDescription() {
        return headDescription;
    }

    public void setHeadDescription(String headDescription) {
        this.headDescription = headDescription;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getBodyTitle() {
        return bodyTitle;
    }

    public void setBodyTitle(String bodyTitle) {
        this.bodyTitle = bodyTitle;
    }

    public String getBodyContent() {
        return bodyContent;
    }

    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }
}
