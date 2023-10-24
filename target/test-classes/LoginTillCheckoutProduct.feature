@regression
Feature: Login Till Check out Product
  @login
  Scenario: Verifikasi pengguna login menggunakan akun yang sudah terdaftar
    Given pengguna menampilkan halaman login website saucedemo
    When  pengguna memasukan username
    And   pengguna memasukan password
    And  pengguna memilih button login
    Then pengguna berhasil login website saucedemo

  @addtocart
  Scenario: User be able to add to cart product
    Given The user successfully logs in and displays the inventory page
    When  User select product image
    And User klik Add to Cart Button
    Then Then users successfully add to cart product and show item on basket

  @checkoutproduct
  Scenario: The user successfully checkout product
    Given The user successfully logs in and Add to cart product
    When User klik shopping cart
    And User klik checkout button
    And User insert first name
    And User insert last name
    And user insert postal code
    And User klik continue button
    When User klik finish button
    Then The user successfully checkout product and display complete page

  @invalidlogin
  Scenario: User can't login with invalid credential
     Given The user is on login pages
     When The User enters invalid username
     And The user enters invalid password
     Then The user klik login button and failed login
