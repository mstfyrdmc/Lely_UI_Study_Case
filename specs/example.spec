Lelly Web UI Test Automation
=====================

Case 1: Verify that the descriptions of each of the search results contain the searched word.
--------------------------------------------------------------------------------
* Enter "https://www.lely.com/en" site
* Click on reject cookies button
* Click on search button
* Search area should be open
* Search "happy" text
* Click on search button on search page
* Scroll to search result title
* I should see descriptions of each of the search results contain the searched "happy" word.


Case 2: Verify selected catalogs
-----------------------------
* Enter "https://www.lely.com/techdocs/" site
* Click on reject cookies button
* I should see technical document page opened
* Click on all documents combobox
* I set document name with "LUNA EUR"
* I clicked on selected document
* I scroll to catalogs
* I should see catalogs
* I clicked on view this document on catalogs
* I should see selected document opened
* Click on second download document button
* I should see seleceted document downloaded



//
//* Almost all words have vowels
//     |Word  |Vowel Count|
//     |------|-----------|
//     |Gauge |3          |
//     |Mingle|2          |
//     |Snap  |1          |
//     |GoCD  |1          |
//     |Rhythm|0          |
