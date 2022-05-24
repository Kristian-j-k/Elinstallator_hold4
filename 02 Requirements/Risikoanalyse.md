# Risiko analyse

|  Risiko | Sandsynlighed | Konsekvens | Prioritet | Revideret sandsynlighed | Revideret konsekvens |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |--------- |
| Sygdom blandt udviklere | 6/10 | Ikke lige så lang tid til at udvikle (6/10)      | Lav    | 3/10 | Stadig et tidstab, men corona er ikke en lige så stor ting længere, så vi regner ikke med noget særlig tidstab. (3/10) |

**Imødekommelses strategi:**

I vores projekt vil der blive taget højde for et vist antal sygedage, hvor vores estimat er på omkring 5-10% fravær.



|  Risiko | Sandsynlighed | Konsekvens | Prioritet | Revideret sandsynlighed | Revideret konsekvens |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |--------- |
| Der opsamles persondata | 10/10 | Persondata bliver ikke opbevaret, gemt korrekt eller følger GDPR lovgivningen (10/10)      | Høj   | 3/10 | Kryptering af gemte data sikrer at GDPR er overholdt (1/10) |

**Imødekommelses strategi**  

Når vi indsamler personlige data, skal GDPR regler overholdes. Vi vil derfor forsøge at kryptere vores data for at kunne overholde disse regler, og for folks sikkerhed.



|  Risiko | Sandsynlighed | Konsekvens | Prioritet | Revideret sandsynlighed | Revideret konsekvens |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |--------- |
| Fejl ved gemning af tilbudsfil | 2/10 | Filen kan ikke åbnes.(10/10)   | Lav    | 1/10 | Filformatet kontrolleres altid og dermed sikres filens integritet.(1/10) |

**Imødekommelses strategi**  
Filformatet bliver valideret af systemet efter det er gemt.


|  Risiko | Sandsynlighed | Konsekvens | Prioritet | Revideret sandsynlighed | Revideret konsekvens |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |--------- |
|Filen kan ikke åbnes i Autocad. | 5/10 | Vi kan ikke imødekomme kundens ønske(8/10)      | Høj   | 3/10 |  Selv med grundig test og undersøgelse er det stadig usikkert om filen kan gemmes i DWG format.(3/10) |

**Imødekommelses strategi**  

Det er usikkert hvordan tegningen skal genereres i korrekt format, det skal derfor undersøges hvordan vi gør det rent teknisk og det skal testes at det er muligt for os at gemme i det format.



|  Risiko | Sandsynlighed | Konsekvens | Prioritet | Revideret sandsynlighed | Revideret konsekvens |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |--------- |
|Udsendelse af email til forkert adresse | 5/10 | Der er en risiko for, at vi får sendt persondata til en forkert email adresse.(5/10)   | Mellem  | 1/10 | Der er stadig en lav chance for at brugeren blot bekræfter adressen uden at kontrollere den, men det er mere sikkert.(1/10) |

**Imødekommelses strategi**  

Modtageremail tages fra en fast liste hvor producent/sælger/tømrer findes og kundens mailadresse skal bekræftes inden mailen sendes.
