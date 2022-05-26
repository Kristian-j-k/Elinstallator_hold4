# UC Opret nye skema

UseCase navn | Opret nye skema | 
-------------| -------------------------------| 
Scope        | El-installatør app
Primary Actor| El-installatører/Kunder
Level        | User-goal
Description  | Systemet skal kunne oprette en bruger i databasen, logge ind med denne bruger, oprette et skema som brugeren skal kunne afkrydse, skabe en .pdf fil af skemaet, sende denne .pdf fil samt eventuel tekst over mail til en modtager, skifte over til fx. Gmail appen for at færdig gøre afsending af email.
Stakeholders and Interests  | Zealand
Preconditions  | Android telefonen er tændt.<br> Applikationen er installeret korrekt og klar til at bruge.
Succes Guarantee  |  Der er blevet oprettet en .pdf fil og den er sendt videre til en modtager som email.  
Main Succes Scenario  | 1. Brugeren skaber en ny konto.<br> 2. 
Extensions  | 1a. Hvis brugeren åbner “Kataloget”<br> 1. Systemet viser en oversigt over standard væg opsætninger. <br> 2. Brugeren vælger en væg opsætning uden dør.<br> 3. Systemet viser min og maks bredde/højde på den væg opsætning der er valgt.<br> Processen fortsætter ved punkt 3.<br><br> 1a 2a. Brugeren ønsker at vælge væg med dør.<br> 1. Brugeren vælger en standard opsætning med dør.<br> 2. Systemet viser min og maks bredde/højde på den væg opsætning der er valgt. <br> 3.Brugeren angiver væggens højde og bredde.<br> 4. Systemet viser en oversigt over greb typer.<br> 5. Brugeren vælger en greb type. Processen fortsætter ved punkt 4.<br><br> 3a. Mangler at udfylde information om højde.<br> 1. System oplyser om fejl og afventer brugerinput. Processen fortsætter ved punkt 3.<br> <br> 3b.  Hvis brugeren angiver negativ tal om højde.<br> 1. System oplyser om fejl og afventer brugerinput. Processen fortsætter ved punkt 3.<br> <br> 3c. Hvis brugeren angiver højden mere end 250 cm.<br> 1. Systemet oplyser at max højde er 250 cm og afventer brugerinput. Processen fortsætter ved punkt 3.<br> <br> 5a. Mangler at udfylde information om bredde.<br> 1. System oplyser om fejl og afventer brugerinput. Processen fortsætter ved punkt 5.<br> <br> 5b. Hvis brugeren angiver negativ tal om bredde.<br> 1. System oplyser om fejl og afventer brugerinput. Processen fortsætter ved punkt 5.<br><br> 5c. Hvis brugeren angiver bredden mere end 150 cm.<br> 1. Systemet oplyser at væggen vil blive sammensat af flere elementer. Processen fortsætter ved punkt 5.<br><br> 9a. Hvis brugeren ønsker at tilpasse designet (speciel type glas)<br> 1. Systemet viser en oversigt over mulige glastyper. <br> 2. Brugeren vælger en glastype. Processen fortsætter fra punkt 8.<br><br> 9b. Hvis brugeren ønsker at tilpasse designet (tilvalg af dør).<br> 1. Systemet viser en oversigt over mulige dørtyper.<br> 2. Brugeren vælger en dør.<br> 3. Systemet viser en oversigt over greb typer.<br> 4. Brugeren vælger en greb type. Processen fortsætter fra punkt 8.<br><br> 9c. Hvis brugeren ikke bekræfter tilbuddet.<br> 1. Forløbet starter forfra ved punkt 1.
Special Requirements  | --
Technology and Data Variations List  | --
Frequency of Occurrence  | Use casen forekommer ved oprettelse af en designe væg
Miscellaneous  | --
