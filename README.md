
# TDD Lab Exercise 3

Oefeningen voor http://wgroeneveld.github.io/tdd-course

## Technologie

In Java. Test Harnas met [JUnit](https://github.com/junit-team/junit4/wiki/Getting-started). Assertions met [AssertJ](http://joel-costigliola.github.io/assertj/).


## Opdracht beschrijving

Werk story per story af, test first!

Commit (en push) per story!

### Story 1: simpele spreadsheet

- Onbeperkt aantal rijen/kolommen
- Rij = nummer 1 -> 9999...
- Kolom = Cijfer A -> Z, AA -> ZZ, ...
- Cellen zijn standaard leeg ("")
- Cellen kunnen tekst opslaan
- Mogelijk om inhoud van cel uit te lezen

### Story 2: numerics & literal values

- **Numerische cellen** worden automatisch herkend:
- Tekst "  124  " (met spaties) wordt het getal 124 (zonder spaties)
- Mogelijk om <strong>literaire</strong> inhoud van cel uit te lezen
- Cel met tekst "  124  " heeft literaire waarde "  124  " en waarde 124

### Story 3: Formules

- "=234" is een formule, " =234" (spatie) is tekst</li>
- Waarde van formule "=234" is het getal 234. Literaire waarde = de formule</li>
- Soorten:
    - Constanten =124
    - Met haakjes =((124))
    - Simpele berekeningen =3+5, =5-3, =4*2
    - Complexe berekeningen =7*(2+3)*((((2+1))))

Tip: berekeningen zoals hierboven hoef je niet zelf te proberen evalueren. Hiervoor kan je de _Nashorn JS_ engine in Java 8 gebruiken:

```java
ScriptEngineManager factory = new ScriptEngineManager();
ScriptEngine engine = factory.getEngineByName("nashorn");
engine.eval('4 + 5');
```

Het spreekt voor zich dat hier testen op zijn plaats zijn.

### Story 4: Formule fouten opvangen

Wanneer een formule een fout bevat, moet de waarde van de cel "**#ERROR**" zijn.

### Story 5: Dependencies

`=A2` als inhoud van cel `A1` bijvoorbeeld.:

- Waarde = waarde van cel waar je naar verwijst.
- Indien waarde A2 verandert, verandert deze cel ook.
- Referenties naar referenties = mogelijk! A1 -> A2 -> A3
- Circulaire referneties vermijden.
- Geef "**#CIRCULAR**" fout als waarde.

### Story 6: Functies

`=SUM(A1:A6)`bijvoorbeeld.

- Sommatie functie met `SUM(RANGE)`
- Gemiddelde functie met `AVERAGE(RANGE)`

### Unit testen

Er zijn **geen testen voorzien** - je zal je beste beentje moeten voor zetten... 

**Wat moet ik nu precies testen?** Alles! Happy path, edge cases, logica, ...

