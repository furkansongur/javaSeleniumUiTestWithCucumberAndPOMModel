# javaSeleniumUiTestWithCucumberAndPOMModel

  Feature: Online shopping process on LC Waikiki website

  Scenario: Completing an order and verifying favorites
  - Given I navigate to homepage
  - When Drag mouse cursor on the Giris Yap icon and click on the Giris Yap button
  - And I enter a valid email and click the Devam button
  - And I enter a valid password and click the Giris Yap button
  - And I drag mouse on the "ÇOCUK & BEBEK" after "KIZ ÇOCUK " and click "Mont ve Kaban" from the submenu
  - When I select "5-6 Yaş" for the Beden filter
  - When I select "6 Yaş" for the Beden filter
  - When I select "6-7 Yaş" for the Beden filter
  - And I select "BEJ" for the Renk filter
  - When I click on the sorting dropdown and select "En çok satanlar"
  - When I click on the "4" product in the list
  - And I select an available size for the product
  - When I get the product name and color
  - And I click the Sepete Ekle button
  - When I navigate to the Sepetim page
  - Then I verify the product name, color, quantity and price are correct
  - When I click on the heart icon on the product card to add it to favorites
  - When I navigate to the Favorilerim page
  - And I verify the previously favorited product is listed using its name
  - And Close the browser
