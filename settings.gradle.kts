rootProject.name = "CartEar"

//include("cart-appclient", "cart-common")
include("cart-appclient", "MojeCartEjbTuto","cart-common")

// Použití dopředných lomítek
project(":cart-appclient").projectDir = File("../../cart-appclient/cart-appclient")
project(":MojeCartEjbTuto").projectDir = File("../../MojeCartEjbTuto")
project(":cart-common").projectDir = File("../../cart-common/cart-common")