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

    String question13 = "Er der tilstrækkelig plads til at arbejde på/adgang til tavlen?";
    String question14 = "Er overstrømsbeskyttelsesudstyr korrekt valgt og evt. indstillet?";
    String question15 = "Er der en entydig mærkning af beskyttelsesudstyr med tilhørsforhold?";
    String question16 = "Er der mærkning om max. mærke-/indstillingsstrøm?";
    String question17 = "Er mærkning med oplysninger om tekniske data for tavlen foretaget?";
    String question18 = "Er udgående beskyttelsesledere anbragt i separate klemmer i tavlen?";
    String question19 = "Er afdækning og dækplader monteret?";
    String question20 = "Er indføringer tilpasset/tætnet, så tavlens kapslingsklasse er som mærket?";

    //3. Installationen
    String text3 = "3. Installation:";

    String question21 = "Er udstyr til adskillelse og afbrydelse korrekt valgt, placeret og installeret?";
    String question22 = "Er stikkontakter og udtag m.m. installeret i henhold til gældende bestemmelser?";
    String question23 = "Er kabler/ledninger korrekt oplagt, afsluttet og forbundet?";
    String question24 = "Er kabler beskyttet mod mekanisk overlast ved opføringer fra gulv/jord?";
    String question25 = "Er tilledninger aflastet for træk og vridning ved tilslutning til installationen?";
    String question26 = "Er alle dæksler og afdækninger monteret, så der ikke er berøringsfare?\n";
    String question27 = "Er alle samlinger let tilgængelige?";

    //4. Indbygningsamaturer
    String text4 = "4. Indbygningsarmaturer:";

    String question28 = "Er indbygningsarmaturer korrekt valgt og monteret?";
    String question29 = "Er indbygningsarmaturer installeret således, at overophedning undgås?";

    //5. Beskyttelsesledere
    String text5 = "5. Beskyttelsesledere og udligningsforbindelser:";

    String question30 = "Er jordingslederen korrekt valgt (minimum 6 mm2)?";
    String question31 = "Er der etableret beskyttende potentialudligning?";
    String question32 = "Er supplerende beskyttende potentialudligning etableret?";
    String question33 = "Er den gennemgående forbindelse i udligningsforbindelser kontrolleret?";
    String question34 = "Er den gennemgående forbindelse i beskyttelsesledere kontrolleret?";
    String question35 = "Er overgangsmodstand for jordelektroden kontrolleret?";

    //6. Fejlbeskyttelse/suplerende beskyttelse
    String text6 = "6. Fejlbeskyttelse/supplerende beskyttelse:";

    String question36 = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjording?";
    String question37 = "Er RCD’er (fejlstrømsafbrydere) kontrolleret og afprøvet?";
    String question38 = "Er klasse I brugsgenstande tilsluttet til beskyttelseslederen?";

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
        questions.add(13, question13);
        questions.add(14, question14);
        questions.add(15, question15);
        questions.add(16, question16);
        questions.add(17, question17);
        questions.add(18, question18);
        questions.add(19, question19);
        questions.add(20, question20);
        questions.add(21, question21);
        questions.add(22, question22);
        questions.add(23, question23);
        questions.add(24, question24);
        questions.add(25, question25);
        questions.add(26, question26);
        questions.add(27, question27);
        questions.add(28, question28);
        questions.add(29, question29);
        questions.add(30, question30);
        questions.add(31, question31);
        questions.add(32, question32);
        questions.add(33, question33);
        questions.add(34, question34);
        questions.add(35, question35);
        questions.add(36, question36);
        questions.add(37, question37);
        questions.add(38, question38);

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
}

