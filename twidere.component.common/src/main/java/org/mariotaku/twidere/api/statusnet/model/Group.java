package org.mariotaku.twidere.api.statusnet.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import org.mariotaku.twidere.api.twitter.util.TwitterDateConverter;

import java.util.Date;

/**
 * Created by mariotaku on 16/3/4.
 */
@JsonObject
public class Group {

    @JsonField(name = "modified", typeConverter = TwitterDateConverter.class)
    Date modified;
    @JsonField(name = "nickname")
    String nickname;
    @JsonField(name = "admin_count")
    int adminCount;
    @JsonField(name = "created", typeConverter = TwitterDateConverter.class)
    Date created;
    @JsonField(name = "id")
    long id;
    @JsonField(name = "homepage")
    String homepage;
    @JsonField(name = "fullname")
    String fullname;
    @JsonField(name = "homepage_logo")
    String homepageLogo;
    @JsonField(name = "mini_logo")
    String miniLogo;
    @JsonField(name = "url")
    String url;
    @JsonField(name = "member_count")
    int memberCount;
    @JsonField(name = "blocked")
    boolean blocked;
    @JsonField(name = "stream_logo")
    String streamLogo;
    @JsonField(name = "member")
    boolean member;
    @JsonField(name = "description")
    String description;
    @JsonField(name = "original_logo")
    String originalLogo;
    @JsonField(name = "location")
    String location;

    public Date getModified() {
        return modified;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAdminCount() {
        return adminCount;
    }

    public Date getCreated() {
        return created;
    }

    public long getId() {
        return id;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getFullname() {
        return fullname;
    }

    public String getHomepageLogo() {
        return homepageLogo;
    }

    public String getMiniLogo() {
        return miniLogo;
    }

    public String getUrl() {
        return url;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public String getStreamLogo() {
        return streamLogo;
    }

    public boolean isMember() {
        return member;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginalLogo() {
        return originalLogo;
    }

    public String getLocation() {
        return location;
    }
}