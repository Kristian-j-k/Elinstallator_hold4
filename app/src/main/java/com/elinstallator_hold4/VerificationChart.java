package com.Elinstallator_hold4;

import java.util.ArrayList;

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


    //Answers - Array with group, question no, answer. answer is: -1 = not filled, 0 = yes, 1 = no, 2 = NA (not applicable)
    // ArrayList<ArrayList<Boolean>> answers = new ArrayList<ArrayList<Boolean>>();

    boolean answer[][] = new boolean[20][4];

    //Questions - arrayList with questions
    ArrayList<String> questions = new ArrayList<String>();


    //1. Gennerelt
    String text1 = "1. Gennerelt:";

    String question0 = "Er der taget hensyn til ydre påvirkninger og anvendt korrekt kapslingsklasse?";
    String question1 = "Er der brandtætnet ved gennemføringer?";
    String question2 = "Er installationen isolationsprøvet?";
    String question3 = "Er der foretaget polaritetsprøve og kontrol af fasefølgen?";
    String question4 = "Er der foretaget funktionsprøver af installationen?";
    String question5 = "Er nul- og beskyttelsesledere korrekt identificeret?";
    String question6 = "Er ledere korrekt overstrømsbeskyttet og valgt efter strømværdi?";
    String question7 = "Er SPD’er (overspændingsbeskyttelsesudstyr) korrekt valgt og installeret?";
    String question8 = "Er permanent tilsluttede brugsgenstande egnet til den pågældende anvendelse?";
    String question9 = "Er nødvendig dokumentation til stede?";
    String question10 = "Er spændingsfald kontrolleret?";
    String question11 = "Er der foretaget foranstaltninger mod elektromagnetiske påvirkninger?";
    String question12 = "Er ejer/bruger informeret om funktion og betjening?";


    //2. Tavlen

    String text2 = "2. Tavlen:";

    String getQuestion13 = "Er der tilstrækkelig plads til at arbejde på/adgang til tavlen?";
    String getQuestion14 = "Er overstrømsbeskyttelsesudstyr korrekt valgt og evt. indstillet?";
    String getQuestion15 = "Er der en entydig mærkning af beskyttelsesudstyr med tilhørsforhold?";
    String getQuestion16 = "Er der mærkning om max. mærke-/indstillingsstrøm?";
    String getQuestion17 = "Er mærkning med oplysninger om tekniske data for tavlen foretaget?";
    String getQuestion18 = "Er udgående beskyttelsesledere anbragt i separate klemmer i tavlen?";
    String getQuestion19 = "Er afdækning og dækplader monteret?";
    String getQuestion20 = "Er indføringer tilpasset/tætnet, så tavlens kapslingsklasse er som mærket?";

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

    public VerificationChart() {


        questions.add(0, question0);
        questions.add(1, question1);
        questions.add(2, question2);
        questions.add(3, question3);
        questions.add(4, question4);
        questions.add(5, question5);
        questions.add(6, question6);
        questions.add(7, question7);
        questions.add(8, question8);
        questions.add(9, question9);
        questions.add(10, question10);
        questions.add(11, question11);
        questions.add(12, question12);




    }






    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setIdentificationOfResponsible(String identificationOfResponsible) {
        this.identificationOfResponsible = identificationOfResponsible;
    }

    public void setInstallationMadeBy(String installationMadeBy) {
        this.installationMadeBy = installationMadeBy;
    }

    public void setVerificationMadeBy(String verificationMadeBy) {
        this.verificationMadeBy = verificationMadeBy;
    }

    public void setDate(String date) {
        Date = date;
    }



    public String getCostumerName() {
        return costumerName;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getIdentificationOfResponsible() {
        return identificationOfResponsible;
    }

    public String getInstallationMadeBy() {
        return installationMadeBy;
    }

    public String getVerificationMadeBy() {
        return verificationMadeBy;
    }

    public String getDate() {
        return Date;
    }

    public String getText1() {
        return text1;
    }

    public String getQuestion1_1() {
        return question0;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public String getQuestion11() {
        return question11;
    }

    public String getQuestion12() {
        return question12;
    }

    public String getText2() {
        return text2;
    }

    public String getGetQuestion13() {
        return getQuestion13;
    }

    public String getGetQuestion14() {
        return getQuestion14;
    }

    public String getGetQuestion15() {
        return getQuestion15;
    }

    public String getGetQuestion16() {
        return getQuestion16;
    }

    public String getGetQuestion17() {
        return getQuestion17;
    }

    public String getGetQuestion18() {
        return getQuestion18;
    }

    public String getGetQuestion19() {
        return getQuestion19;
    }

    public String getGetQuestion20() {
        return getQuestion20;
    }


    public String getText3() {
        return text3;
    }

    public String getGetQuestion3_1() {
        return getQuestion3_1;
    }

    public String getGetQuestion3_2() {
        return getQuestion3_2;
    }

    public String getGetQuestion3_3() {
        return getQuestion3_3;
    }

    public String getGetQuestion3_4() {
        return getQuestion3_4;
    }

    public String getGetQuestion3_5() {
        return getQuestion3_5;
    }

    public String getGetQuestion3_6() {
        return getQuestion3_6;
    }

    public String getGetQuestion3_7() {
        return getQuestion3_7;
    }



    public String getText4() {
        return text4;
    }

    public String getGetQuestion4_1() {
        return getQuestion4_1;
    }

    public String getGetQuestion4_2() {
        return getQuestion4_2;
    }


    public String getText5() {
        return text5;
    }

    public String getGetQuestion5_1() {
        return getQuestion5_1;
    }

    public String getGetQuestion5_2() {
        return getQuestion5_2;
    }

    public String getGetQuestion5_3() {
        return getQuestion5_3;
    }

    public String getGetQuestion5_4() {
        return getQuestion5_4;
    }

    public String getGetQuestion5_5() {
        return getQuestion5_5;
    }

    public String getGetQuestion5_6() {
        return getQuestion5_6;
    }


    public String getText6() {
        return text6;
    }

    public String getGetQuestion6_1() {
        return getQuestion6_1;
    }

    public String getGetQuestion6_2() {
        return getQuestion6_2;
    }

    public String getGetQuestion6_3() {
        return getQuestion6_3;
    }


    public String getText() {
        return text;
    }

}