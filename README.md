# DataBindingExampleApp
Example Android app demonstrating use of [data binding](https://developer.android.com/tools/data-binding/guide.html)

Structure:
-MainActivity:
  |   * binds User POJO in nested Activity layout
  |   * observe changes on User POJO
  |
  +->DetailsActivity:
      * binds Details POJO in Fragment layout
      * access view through binding
