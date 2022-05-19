package com.Elinstallator_hold4;

public class VerificationChart {

    //Installation information
    String costumerName;
    String address;
    String zip;
    String city;
    String orderNo;
    String identificationOfResponsible;
    String installationMadeBy;
    String verificationMadeBy;
    String Date;

    //1. Gennerelt
    String text1 = "1. Gennerelt:";

    String question1_1 = "Er der taget hensyn til ydre påvirkninger og anvendt korrekt kapslingsklasse?";
    String question1_2 = "Er der brandtætnet ved gennemføringer?";
    String question1_3 = "Er installationen isolationsprøvet?";
    String question1_4 = "Er der foretaget polaritetsprøve og kontrol af fasefølgen?";
    String question1_5 = "Er der foretaget funktionsprøver af installationen?";
    String question1_6 = "Er nul- og beskyttelsesledere korrekt identificeret?";
    String question1_7 = "Er ledere korrekt overstrømsbeskyttet og valgt efter strømværdi?";
    String question1_8 = "Er SPD’er (overspændingsbeskyttelsesudstyr) korrekt valgt og installeret?";
    String question1_9 = "Er permanent tilsluttede brugsgenstande egnet til den pågældende anvendelse?";
    String question1_10 = "Er nødvendig dokumentation til stede?";
    String question1_11 = "Er spændingsfald kontrolleret?";
    String question1_12 = "Er der foretaget foranstaltninger mod elektromagnetiske påvirkninger?";
    String question1_13 = "Er ejer/bruger informeret om funktion og betjening?";

    //2. Tavlen

    String text2 = "2. Tavlen:";

    String getQuestion2_1 = "Er der tilstrækkelig plads til at arbejde på/adgang til tavlen?";
    String getQuestion2_2 = "Er overstrømsbeskyttelsesudstyr korrekt valgt og evt. indstillet?";
    String getQuestion2_3 = "Er der en entydig mærkning af beskyttelsesudstyr med tilhørsforhold?";
    String getQuestion2_4 = "Er der mærkning om max. mærke-/indstillingsstrøm?";
    String getQuestion2_5 = "Er mærkning med oplysninger om tekniske data for tavlen foretaget?";
    String getQuestion2_6 = "Er udgående beskyttelsesledere anbragt i separate klemmer i tavlen?";
    String getQuestion2_7 = "Er afdækning og dækplader monteret?";
    String getQuestion2_8 = "Er indføringer tilpasset/tætnet, så tavlens kapslingsklasse er som mærket?";

    //3. Installationen
    String text3 = "3. Installation:";

    String getQuestion3_1 = "Er udstyr til adskillelse og afbrydelse korrekt valgt, placeret og installeret?";
    String getQuestion3_2 = "Er stikkontakter og udtag m.m. installeret i henhold til gældende bestemmelser?";
    String getQuestion3_3 = "Er kabler/ledninger korrekt oplagt, afsluttet og forbundet?";
    String getQuestion3_4 = "Er kabler beskyttet mod mekanisk overlast ved opføringer fra gulv/jord?";
    String getQuestion3_5 = "Er tilledninger aflastet for træk og vridning ved tilslutning til installationen?";
    String getQuestion3_6 = "Er alle dæksler og afdækninger monteret, så der ikke er berøringsfare?\n";
    String getQuestion3_7 = "Er alle samlinger let tilgængelige?";


    //4. Indbygningsamaturer
    String text4 = "4. Indbygningsarmaturer:";

    String getQuestion4_1 = "Er indbygningsarmaturer korrekt valgt og monteret?";
    String getQuestion4_2 = "Er indbygningsarmaturer installeret således, at overophedning undgås?";

    //5. Beskyttelsesledere
    String text5 = "5. Beskyttelsesledere og udligningsforbindelser:";

    String getQuestion5_1 = "Er jordingslederen korrekt valgt (minimum 6 mm2)?";
    String getQuestion5_2 = "Er der etableret beskyttende potentialudligning?";
    String getQuestion5_3 = "Er supplerende beskyttende potentialudligning etableret?";
    String getQuestion5_4 = "Er den gennemgående forbindelse i udligningsforbindelser kontrolleret?";
    String getQuestion5_5 = "Er den gennemgående forbindelse i beskyttelsesledere kontrolleret?";
    String getQuestion5_6 = "Er overgangsmodstand for jordelektroden kontrolleret?";

    //6. Fejlbeskyttelse/suplerende beskyttelse
    String text6 = "6. Fejlbeskyttelse/supplerende beskyttelse:";

    String getQuestion6_1 = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjording?";
    String getQuestion6_2 = "Er RCD’er (fejlstrømsafbrydere) kontrolleret og afprøvet?";
    String getQuestion6_3 = "Er klasse I brugsgenstande tilsluttet til beskyttelseslederen?";

    //Måleresultater
    String text = "Måleresultater" +
            "Her kan anføres relevante kredsdetaljer og måleresultater i forbindelse med idriftsættelse af installationen. ";
    //Kredsdetaljer

    //Afprøvning af RCD'er

    //Kortslutningsstrøm


    public VerificationChart() { //todo include costumer name and adress etc

    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getIdentificationOfResponsible() {
        return identificationOfResponsible;
    }

    public void setIdentificationOfResponsible(String identificationOfResponsible) {
        this.identificationOfResponsible = identificationOfResponsible;
    }

    public String getInstallationMadeBy() {
        return installationMadeBy;
    }

    public void setInstallationMadeBy(String installationMadeBy) {
        this.installationMadeBy = installationMadeBy;
    }

    public String getVerificationMadeBy() {
        return verificationMadeBy;
    }

    public void setVerificationMadeBy(String verificationMadeBy) {
        this.verificationMadeBy = verificationMadeBy;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getQuestion1_1() {
        return question1_1;
    }

    public void setQuestion1_1(String question1_1) {
        this.question1_1 = question1_1;
    }

    public String getQuestion1_2() {
        return question1_2;
    }

    public void setQuestion1_2(String question1_2) {
        this.question1_2 = question1_2;
    }

    public String getQuestion1_3() {
        return question1_3;
    }

    public void setQuestion1_3(String question1_3) {
        this.question1_3 = question1_3;
    }

    public String getQuestion1_4() {
        return question1_4;
    }

    public void setQuestion1_4(String question1_4) {
        this.question1_4 = question1_4;
    }

    public String getQuestion1_5() {
        return question1_5;
    }

    public void setQuestion1_5(String question1_5) {
        this.question1_5 = question1_5;
    }

    public String getQuestion1_6() {
        return question1_6;
    }

    public void setQuestion1_6(String question1_6) {
        this.question1_6 = question1_6;
    }

    public String getQuestion1_7() {
        return question1_7;
    }

    public void setQuestion1_7(String question1_7) {
        this.question1_7 = question1_7;
    }

    public String getQuestion1_8() {
        return question1_8;
    }

    public void setQuestion1_8(String question1_8) {
        this.question1_8 = question1_8;
    }

    public String getQuestion1_9() {
        return question1_9;
    }

    public void setQuestion1_9(String question1_9) {
        this.question1_9 = question1_9;
    }

    public String getQuestion1_10() {
        return question1_10;
    }

    public void setQuestion1_10(String question1_10) {
        this.question1_10 = question1_10;
    }

    public String getQuestion1_11() {
        return question1_11;
    }

    public void setQuestion1_11(String question1_11) {
        this.question1_11 = question1_11;
    }

    public String getQuestion1_12() {
        return question1_12;
    }

    public void setQuestion1_12(String question1_12) {
        this.question1_12 = question1_12;
    }

    public String getQuestion1_13() {
        return question1_13;
    }

    public void setQuestion1_13(String question1_13) {
        this.question1_13 = question1_13;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getGetQuestion2_1() {
        return getQuestion2_1;
    }

    public void setGetQuestion2_1(String getQuestion2_1) {
        this.getQuestion2_1 = getQuestion2_1;
    }

    public String getGetQuestion2_2() {
        return getQuestion2_2;
    }

    public void setGetQuestion2_2(String getQuestion2_2) {
        this.getQuestion2_2 = getQuestion2_2;
    }

    public String getGetQuestion2_3() {
        return getQuestion2_3;
    }

    public void setGetQuestion2_3(String getQuestion2_3) {
        this.getQuestion2_3 = getQuestion2_3;
    }

    public String getGetQuestion2_4() {
        return getQuestion2_4;
    }

    public void setGetQuestion2_4(String getQuestion2_4) {
        this.getQuestion2_4 = getQuestion2_4;
    }

    public String getGetQuestion2_5() {
        return getQuestion2_5;
    }

    public void setGetQuestion2_5(String getQuestion2_5) {
        this.getQuestion2_5 = getQuestion2_5;
    }

    public String getGetQuestion2_6() {
        return getQuestion2_6;
    }

    public void setGetQuestion2_6(String getQuestion2_6) {
        this.getQuestion2_6 = getQuestion2_6;
    }

    public String getGetQuestion2_7() {
        return getQuestion2_7;
    }

    public void setGetQuestion2_7(String getQuestion2_7) {
        this.getQuestion2_7 = getQuestion2_7;
    }

    public String getGetQuestion2_8() {
        return getQuestion2_8;
    }

    public void setGetQuestion2_8(String getQuestion2_8) {
        this.getQuestion2_8 = getQuestion2_8;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getGetQuestion3_1() {
        return getQuestion3_1;
    }

    public void setGetQuestion3_1(String getQuestion3_1) {
        this.getQuestion3_1 = getQuestion3_1;
    }

    public String getGetQuestion3_2() {
        return getQuestion3_2;
    }

    public void setGetQuestion3_2(String getQuestion3_2) {
        this.getQuestion3_2 = getQuestion3_2;
    }

    public String getGetQuestion3_3() {
        return getQuestion3_3;
    }

    public void setGetQuestion3_3(String getQuestion3_3) {
        this.getQuestion3_3 = getQuestion3_3;
    }

    public String getGetQuestion3_4() {
        return getQuestion3_4;
    }

    public void setGetQuestion3_4(String getQuestion3_4) {
        this.getQuestion3_4 = getQuestion3_4;
    }

    public String getGetQuestion3_5() {
        return getQuestion3_5;
    }

    public void setGetQuestion3_5(String getQuestion3_5) {
        this.getQuestion3_5 = getQuestion3_5;
    }

    public String getGetQuestion3_6() {
        return getQuestion3_6;
    }

    public void setGetQuestion3_6(String getQuestion3_6) {
        this.getQuestion3_6 = getQuestion3_6;
    }

    public String getGetQuestion3_7() {
        return getQuestion3_7;
    }

    public void setGetQuestion3_7(String getQuestion3_7) {
        this.getQuestion3_7 = getQuestion3_7;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getGetQuestion4_1() {
        return getQuestion4_1;
    }

    public void setGetQuestion4_1(String getQuestion4_1) {
        this.getQuestion4_1 = getQuestion4_1;
    }

    public String getGetQuestion4_2() {
        return getQuestion4_2;
    }

    public void setGetQuestion4_2(String getQuestion4_2) {
        this.getQuestion4_2 = getQuestion4_2;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getGetQuestion5_1() {
        return getQuestion5_1;
    }

    public void setGetQuestion5_1(String getQuestion5_1) {
        this.getQuestion5_1 = getQuestion5_1;
    }

    public String getGetQuestion5_2() {
        return getQuestion5_2;
    }

    public void setGetQuestion5_2(String getQuestion5_2) {
        this.getQuestion5_2 = getQuestion5_2;
    }

    public String getGetQuestion5_3() {
        return getQuestion5_3;
    }

    public void setGetQuestion5_3(String getQuestion5_3) {
        this.getQuestion5_3 = getQuestion5_3;
    }

    public String getGetQuestion5_4() {
        return getQuestion5_4;
    }

    public void setGetQuestion5_4(String getQuestion5_4) {
        this.getQuestion5_4 = getQuestion5_4;
    }

    public String getGetQuestion5_5() {
        return getQuestion5_5;
    }

    public void setGetQuestion5_5(String getQuestion5_5) {
        this.getQuestion5_5 = getQuestion5_5;
    }

    public String getGetQuestion5_6() {
        return getQuestion5_6;
    }

    public void setGetQuestion5_6(String getQuestion5_6) {
        this.getQuestion5_6 = getQuestion5_6;
    }

    public String getText6() {
        return text6;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }

    public String getGetQuestion6_1() {
        return getQuestion6_1;
    }

    public void setGetQuestion6_1(String getQuestion6_1) {
        this.getQuestion6_1 = getQuestion6_1;
    }

    public String getGetQuestion6_2() {
        return getQuestion6_2;
    }

    public void setGetQuestion6_2(String getQuestion6_2) {
        this.getQuestion6_2 = getQuestion6_2;
    }

    public String getGetQuestion6_3() {
        return getQuestion6_3;
    }

    public void setGetQuestion6_3(String getQuestion6_3) {
        this.getQuestion6_3 = getQuestion6_3;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
