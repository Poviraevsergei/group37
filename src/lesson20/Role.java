package lesson20;

public enum Role {
    USER(false),
    ADMIN(true),
    MODERATOR(true);

    boolean canRemoveUsers;

    Role(boolean canRemoveUsers) {
        this.canRemoveUsers = canRemoveUsers;
    }

    public boolean isCanRemoveUsers() {
        return canRemoveUsers;
    }

    public void setCanRemoveUsers(boolean canRemoveUsers) {
        this.canRemoveUsers = canRemoveUsers;
    }
}
