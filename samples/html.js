class Product {
    constructor(name, description) {
      this.name = name;
      this.description = description;
    }
  }

  const products = [
    new Product('Product 1', 'Description 1'),
    new Product('Product 2', 'Description 2'),
    new Product('Product 3', 'Description 3'),
  ];

  const productListContainer = document.getElementById('productList');
  const productDetailsContainer = document.getElementById('productDetails');
  const productTitle = document.getElementById('productTitle');
  const productDescription = document.getElementById('productDescription');
  const backButton = document.getElementById('backButton');

  function showProductList() {
    productListContainer.style.display = 'block';
    productDetailsContainer.style.display = 'none';
  }

  function showProductDetails(product) {
    productListContainer.style.display = 'none';
    productDetailsContainer.style.display = 'block';
    productTitle.textContent = product.name;
    productDescription.textContent = product.description;
  }

  function createProductElements() {
    products.forEach((product) => {
      const productItem = document.createElement('div');
      productItem.classList.add('product-item');
      productItem.textContent = product.name;

      productItem.addEventListener('click', () => {
        showProductDetails(product);
      });

      productListContainer.appendChild(productItem);
    });
  }

  backButton.addEventListener('click', () => {
    showProductList();
  });

  createProductElements();
