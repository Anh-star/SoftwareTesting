describe("Checkout Test", () => {
  beforeEach(() => {
    cy.visit("https://www.saucedemo.com");
    cy.get("#user-name").type("standard_user");
    cy.get("#password").type("secret_sauce");
    cy.get("#login-button").click();
  });

  it("Should checkout with valid information", () => {
    cy.get(".inventory_item").first().find(".btn_inventory").click();
    cy.get(".shopping_cart_badge").should("have.text", "1");
    cy.get(".shopping_cart_link").click();
    cy.get("#checkout").click();
    cy.get("#first-name").type("John");
    cy.get("#last-name").type("Doe");
    cy.get("#postal-code").type("12345");
    cy.get("#continue").click();
    cy.get(".summary_total_label").should("have.text", "Total: $32.39");
    cy.get("#finish").click();
    cy.get(".complete-header").should("have.text", "Thank you for your order!");
  });
});
