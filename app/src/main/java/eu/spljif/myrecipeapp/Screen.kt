package eu.spljif.myrecipeapp

sealed class Screen(val route: String) {
    object RecipeScreen: Screen("recipescreen")
    object DetailScreen : Screen("detailscreen")
}