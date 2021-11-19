function NavbarController() {
    this.title = 'Products Manager'
}

app.component('navbar', {
    templateUrl: 'src/main/components/navbar/navbar.component.html',
    controller: NavbarController
})