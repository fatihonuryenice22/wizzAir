
Feature: Airplane Ticket Search and User Login

  Scenario: User Login
    Given Kullanıcı websiteyi açar
    When Login butonu tıklanır
    Then username password girilir
    And ana sayfaya yönlendirilir

  Scenario: Find the Cheapest Airplane Ticket
    Given Kullanıcı login olur
    When flights seçeneği seçilir
    And Round trip seçeneği seçilir
    And Gidiş yeri dönüş yeri seçilir
    When Search butonuna tıklanır
    Then En ucuz bilet seçilir


  Scenario: Find the most expensive Ticket
    Given Kullanıcı login olur
    When flights seçeneği seçilir
    And Round trip seçeneği seçilir
    And Gidiş yeri dönüş yeri seçilir
    When Search butonuna tıklanır
    Then En pahalı bilet seçilir





