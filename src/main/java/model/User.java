package model;

public class User {
    private String name;
    private int public_repos;
    private int following;
    private int followers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public User() {
    }

    public User(String name, int public_repos, int following, int followers) {
        this.name = name;
        this.public_repos = public_repos;
        this.following = following;
        this.followers = followers;
    }
}
