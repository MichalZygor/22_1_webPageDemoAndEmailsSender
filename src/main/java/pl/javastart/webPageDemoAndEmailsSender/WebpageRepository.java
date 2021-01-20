package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class WebpageRepository {
    private ArrayList<WebPagePart> webPageParts;

    public WebpageRepository() {
        webPageParts = new ArrayList<>();
        webPageParts.add(new WebPagePart(WebPageList.HOME_PAGE, "VAZZA - strona domowa"
                , "Drewno od Nas dla Was", "Designed by Michał Zygor, 2021.01"
                , "Witamy w VAZZA Poland!", "Czołowe i innowacyjne rozwiązania dla branży drzewnej. VAZZA jest globalnym koncernem technologicznym, który dostarcza rozwiązania dla przemysłu drzewnego, wspierając w ten sposób rozwój nowej generacji. Technologia VAZZA umożliwia produktom widzenie, myślenie i działanie („see. think. act”). W trzech obszarach technologicznych, takich jak sterowanie ruchem prototypów, zintegrowane bezpieczeństwo, elektromobilność, firma VAZZA oferuje kompleksowe rozwiązania dla producentów oraz dostawców usług . Firma VAZZA oferuje technologię elektromobilności dla różnych rodzajów maszynerii. Dzięki swoim produktom, firma przyczynia się do redukcji emisji zanieczyszczeń i ochrony klimatu."));
        webPageParts.add(new WebPagePart(WebPageList.WHY_VAZZA, "VAZZA - strona domowa"
                , "Drewno od Nas dla Was", "Designed by Michał Zygor, 2021.01"
                , "Dlaczego VAZZA Poland? <br /> \nKim jesteśmy? <br />\nVAZZA Poland – TWORZYMY PRZYSZŁOŚĆ!"
                , ""));
//        webPageParts.add(new WebPagePart());
//        webPageParts.add(new WebPagePart());
//        webPageParts.add(new WebPagePart());
//        webPageParts.add(new WebPagePart());
    }
}
