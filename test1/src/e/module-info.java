module e {
    requires d;
    provides c.lib.UserService with e.lib.UserServiceNewImpl;
}
