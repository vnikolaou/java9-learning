module b {
    requires d;
    provides c.lib.UserService with b.lib.UserServiceImpl;
}
