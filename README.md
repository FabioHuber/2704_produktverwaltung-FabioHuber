# 2704_Produktverwaltung

Erstelle ein JavaFX Programm zur Verwaltung von Produktdaten gemäß dem MVC Pattern.

Model:
- ProduktID: wird automatisch vergeben beim Anlegen eines Produkts, beginnend mit #1001
- Produktname
- Produktbeschreibung
- Produktnettopreis (ohne MWST)
- Produtkbruttopreis (mit MWST) - wird automatisch berechnet, sobald der ein Nettopreis vorliegt


View:
- Überschrift: Produktdatenbank
- ProduktID darf nicht geändert werden -> Label
- Name, Beschreibung, Nettopreis -> TextField
- Bruttopreis: wird automatisch berechnet
- Buttons:
  - Neu
  - Speichern
  - Ausgabe 

Gestalte die GUI mit HBox/VBox

Controller:
- Neu: 
  - neues Produkt wird angelegt
  - alle Eingabefelder werden gelöscht
  - ProduktID wird angezeigt
  - Neu Button und Ausgabe Button werden deaktiviert
- Save:
  - übernimmt die Daten aus der GUI ins Model
- Print:
  - Ausgabe ALLER gespeicherten PRodukte in die Konsole (Textausgabe)
- sobald der User einen Nettopreis eingibt, soll der Bruttopreis brechnet und angezeigt werden
  - Verwende dazu setOnKeyTyped() anstatt setOnAction()    
