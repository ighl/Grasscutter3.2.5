// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SocialDetailOuterClass
{
    private static final Descriptors.Descriptor internal_static_SocialDetail_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SocialDetail_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SocialDetailOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SocialDetailOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012SocialDetail.proto\u001a\u000eBirthday.proto\u001a\u001bFriendEnterHomeOption.proto\u001a\u0017FriendOnlineState.proto\u001a\u0014ProfilePicture.proto\u001a\u001aSocialShowAvatarInfo.proto\"°\u0005\n\fSocialDetail\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\r\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\r\n\u0005level\u0018\u0003 \u0001(\r\u0012\u0011\n\tavatar_id\u0018\u0004 \u0001(\r\u0012\u0011\n\tsignature\u0018\u0005 \u0001(\t\u0012\u001b\n\bbirthday\u0018\u0006 \u0001(\u000b2\t.Birthday\u0012\u0013\n\u000bworld_level\u0018\u0007 \u0001(\r\u0012\u0015\n\rreserved_list\u0018\b \u0003(\r\u0012(\n\fonline_state\u0018\t \u0001(\u000e2\u0012.FriendOnlineState\u0012\r\n\u0005param\u0018\n \u0001(\r\u0012\u0011\n\tis_friend\u0018\u000b \u0001(\b\u0012\u001c\n\u0014is_mp_mode_available\u0018\f \u0001(\b\u0012\u0011\n\tonline_id\u0018\r \u0001(\t\u0012\u0014\n\fname_card_id\u0018\u000e \u0001(\r\u0012\u0017\n\u000fis_in_blacklist\u0018\u000f \u0001(\b\u0012\u001a\n\u0012is_chat_no_disturb\u0018\u0010 \u0001(\b\u0012\u0013\n\u000bremark_name\u0018\u0011 \u0001(\t\u0012\u001e\n\u0016finish_achievement_num\u0018\u0012 \u0001(\r\u0012\u0019\n\u0011tower_floor_index\u0018\u0013 \u0001(\r\u0012\u0019\n\u0011tower_level_index\u0018\u0014 \u0001(\r\u0012\u0016\n\u000eis_show_avatar\u0018\u0015 \u0001(\b\u00124\n\u0015show_avatar_info_list\u0018\u0016 \u0003(\u000b2\u0015.SocialShowAvatarInfo\u0012\u001e\n\u0016show_name_card_id_list\u0018\u0017 \u0003(\r\u00128\n\u0018friend_enter_home_option\u0018\u0018 \u0001(\u000e2\u0016.FriendEnterHomeOption\u0012(\n\u000fprofile_picture\u0018\u0019 \u0001(\u000b2\u000f.ProfilePictureB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SocialDetailOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BirthdayOuterClass.getDescriptor(), FriendEnterHomeOptionOuterClass.getDescriptor(), FriendOnlineStateOuterClass.getDescriptor(), ProfilePictureOuterClass.getDescriptor(), SocialShowAvatarInfoOuterClass.getDescriptor() });
        internal_static_SocialDetail_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SocialDetail_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SocialDetailOuterClass.internal_static_SocialDetail_descriptor, new String[] { "Uid", "Nickname", "Level", "AvatarId", "Signature", "Birthday", "WorldLevel", "ReservedList", "OnlineState", "Param", "IsFriend", "IsMpModeAvailable", "OnlineId", "NameCardId", "IsInBlacklist", "IsChatNoDisturb", "RemarkName", "FinishAchievementNum", "TowerFloorIndex", "TowerLevelIndex", "IsShowAvatar", "ShowAvatarInfoList", "ShowNameCardIdList", "FriendEnterHomeOption", "ProfilePicture" });
        BirthdayOuterClass.getDescriptor();
        FriendEnterHomeOptionOuterClass.getDescriptor();
        FriendOnlineStateOuterClass.getDescriptor();
        ProfilePictureOuterClass.getDescriptor();
        SocialShowAvatarInfoOuterClass.getDescriptor();
    }
    
    public static final class SocialDetail extends GeneratedMessageV3 implements SocialDetailOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 1;
        private int uid_;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        private volatile Object nickname_;
        public static final int LEVEL_FIELD_NUMBER = 3;
        private int level_;
        public static final int AVATAR_ID_FIELD_NUMBER = 4;
        private int avatarId_;
        public static final int SIGNATURE_FIELD_NUMBER = 5;
        private volatile Object signature_;
        public static final int BIRTHDAY_FIELD_NUMBER = 6;
        private BirthdayOuterClass.Birthday birthday_;
        public static final int WORLD_LEVEL_FIELD_NUMBER = 7;
        private int worldLevel_;
        public static final int RESERVED_LIST_FIELD_NUMBER = 8;
        private Internal.IntList reservedList_;
        private int reservedListMemoizedSerializedSize;
        public static final int ONLINE_STATE_FIELD_NUMBER = 9;
        private int onlineState_;
        public static final int PARAM_FIELD_NUMBER = 10;
        private int param_;
        public static final int IS_FRIEND_FIELD_NUMBER = 11;
        private boolean isFriend_;
        public static final int IS_MP_MODE_AVAILABLE_FIELD_NUMBER = 12;
        private boolean isMpModeAvailable_;
        public static final int ONLINE_ID_FIELD_NUMBER = 13;
        private volatile Object onlineId_;
        public static final int NAME_CARD_ID_FIELD_NUMBER = 14;
        private int nameCardId_;
        public static final int IS_IN_BLACKLIST_FIELD_NUMBER = 15;
        private boolean isInBlacklist_;
        public static final int IS_CHAT_NO_DISTURB_FIELD_NUMBER = 16;
        private boolean isChatNoDisturb_;
        public static final int REMARK_NAME_FIELD_NUMBER = 17;
        private volatile Object remarkName_;
        public static final int FINISH_ACHIEVEMENT_NUM_FIELD_NUMBER = 18;
        private int finishAchievementNum_;
        public static final int TOWER_FLOOR_INDEX_FIELD_NUMBER = 19;
        private int towerFloorIndex_;
        public static final int TOWER_LEVEL_INDEX_FIELD_NUMBER = 20;
        private int towerLevelIndex_;
        public static final int IS_SHOW_AVATAR_FIELD_NUMBER = 21;
        private boolean isShowAvatar_;
        public static final int SHOW_AVATAR_INFO_LIST_FIELD_NUMBER = 22;
        private List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> showAvatarInfoList_;
        public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 23;
        private Internal.IntList showNameCardIdList_;
        private int showNameCardIdListMemoizedSerializedSize;
        public static final int FRIEND_ENTER_HOME_OPTION_FIELD_NUMBER = 24;
        private int friendEnterHomeOption_;
        public static final int PROFILE_PICTURE_FIELD_NUMBER = 25;
        private ProfilePictureOuterClass.ProfilePicture profilePicture_;
        private byte memoizedIsInitialized;
        private static final SocialDetail DEFAULT_INSTANCE;
        private static final Parser<SocialDetail> PARSER;
        
        private SocialDetail(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.reservedListMemoizedSerializedSize = -1;
            this.showNameCardIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SocialDetail() {
            this.reservedListMemoizedSerializedSize = -1;
            this.showNameCardIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.nickname_ = "";
            this.signature_ = "";
            this.reservedList_ = GeneratedMessageV3.emptyIntList();
            this.onlineState_ = 0;
            this.onlineId_ = "";
            this.remarkName_ = "";
            this.showAvatarInfoList_ = Collections.emptyList();
            this.showNameCardIdList_ = GeneratedMessageV3.emptyIntList();
            this.friendEnterHomeOption_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SocialDetail();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SocialDetail(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.nickname_ = s;
                            continue;
                        }
                        case 24: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 42: {
                            final String s = input.readStringRequireUtf8();
                            this.signature_ = s;
                            continue;
                        }
                        case 50: {
                            BirthdayOuterClass.Birthday.Builder subBuilder = null;
                            if (this.birthday_ != null) {
                                subBuilder = this.birthday_.toBuilder();
                            }
                            this.birthday_ = input.readMessage(BirthdayOuterClass.Birthday.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.birthday_);
                                this.birthday_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 56: {
                            this.worldLevel_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.reservedList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.reservedList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.reservedList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.reservedList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 72: {
                            final int rawValue = input.readEnum();
                            this.onlineState_ = rawValue;
                            continue;
                        }
                        case 80: {
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.isFriend_ = input.readBool();
                            continue;
                        }
                        case 96: {
                            this.isMpModeAvailable_ = input.readBool();
                            continue;
                        }
                        case 106: {
                            final String s = input.readStringRequireUtf8();
                            this.onlineId_ = s;
                            continue;
                        }
                        case 112: {
                            this.nameCardId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.isInBlacklist_ = input.readBool();
                            continue;
                        }
                        case 128: {
                            this.isChatNoDisturb_ = input.readBool();
                            continue;
                        }
                        case 138: {
                            final String s = input.readStringRequireUtf8();
                            this.remarkName_ = s;
                            continue;
                        }
                        case 144: {
                            this.finishAchievementNum_ = input.readUInt32();
                            continue;
                        }
                        case 152: {
                            this.towerFloorIndex_ = input.readUInt32();
                            continue;
                        }
                        case 160: {
                            this.towerLevelIndex_ = input.readUInt32();
                            continue;
                        }
                        case 168: {
                            this.isShowAvatar_ = input.readBool();
                            continue;
                        }
                        case 178: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.showAvatarInfoList_ = new ArrayList<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.showAvatarInfoList_.add(input.readMessage(SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 184: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.showNameCardIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.showNameCardIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 186: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x4) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.showNameCardIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x4;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.showNameCardIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 192: {
                            final int rawValue = input.readEnum();
                            this.friendEnterHomeOption_ = rawValue;
                            continue;
                        }
                        case 202: {
                            ProfilePictureOuterClass.ProfilePicture.Builder subBuilder2 = null;
                            if (this.profilePicture_ != null) {
                                subBuilder2 = this.profilePicture_.toBuilder();
                            }
                            this.profilePicture_ = input.readMessage(ProfilePictureOuterClass.ProfilePicture.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.profilePicture_);
                                this.profilePicture_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.reservedList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>)this.showAvatarInfoList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.showNameCardIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SocialDetailOuterClass.internal_static_SocialDetail_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SocialDetailOuterClass.internal_static_SocialDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(SocialDetail.class, Builder.class);
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public String getNickname() {
            final Object ref = this.nickname_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.nickname_ = s);
        }
        
        @Override
        public ByteString getNicknameBytes() {
            final Object ref = this.nickname_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.nickname_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public String getSignature() {
            final Object ref = this.signature_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.signature_ = s);
        }
        
        @Override
        public ByteString getSignatureBytes() {
            final Object ref = this.signature_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.signature_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasBirthday() {
            return this.birthday_ != null;
        }
        
        @Override
        public BirthdayOuterClass.Birthday getBirthday() {
            return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
        }
        
        @Override
        public BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
            return this.getBirthday();
        }
        
        @Override
        public int getWorldLevel() {
            return this.worldLevel_;
        }
        
        @Override
        public List<Integer> getReservedListList() {
            return this.reservedList_;
        }
        
        @Override
        public int getReservedListCount() {
            return this.reservedList_.size();
        }
        
        @Override
        public int getReservedList(final int index) {
            return this.reservedList_.getInt(index);
        }
        
        @Override
        public int getOnlineStateValue() {
            return this.onlineState_;
        }
        
        @Override
        public FriendOnlineStateOuterClass.FriendOnlineState getOnlineState() {
            final FriendOnlineStateOuterClass.FriendOnlineState result = FriendOnlineStateOuterClass.FriendOnlineState.valueOf(this.onlineState_);
            return (result == null) ? FriendOnlineStateOuterClass.FriendOnlineState.UNRECOGNIZED : result;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public boolean getIsFriend() {
            return this.isFriend_;
        }
        
        @Override
        public boolean getIsMpModeAvailable() {
            return this.isMpModeAvailable_;
        }
        
        @Override
        public String getOnlineId() {
            final Object ref = this.onlineId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.onlineId_ = s);
        }
        
        @Override
        public ByteString getOnlineIdBytes() {
            final Object ref = this.onlineId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.onlineId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getNameCardId() {
            return this.nameCardId_;
        }
        
        @Override
        public boolean getIsInBlacklist() {
            return this.isInBlacklist_;
        }
        
        @Override
        public boolean getIsChatNoDisturb() {
            return this.isChatNoDisturb_;
        }
        
        @Override
        public String getRemarkName() {
            final Object ref = this.remarkName_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.remarkName_ = s);
        }
        
        @Override
        public ByteString getRemarkNameBytes() {
            final Object ref = this.remarkName_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.remarkName_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getFinishAchievementNum() {
            return this.finishAchievementNum_;
        }
        
        @Override
        public int getTowerFloorIndex() {
            return this.towerFloorIndex_;
        }
        
        @Override
        public int getTowerLevelIndex() {
            return this.towerLevelIndex_;
        }
        
        @Override
        public boolean getIsShowAvatar() {
            return this.isShowAvatar_;
        }
        
        @Override
        public List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> getShowAvatarInfoListList() {
            return this.showAvatarInfoList_;
        }
        
        @Override
        public List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList() {
            return this.showAvatarInfoList_;
        }
        
        @Override
        public int getShowAvatarInfoListCount() {
            return this.showAvatarInfoList_.size();
        }
        
        @Override
        public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getShowAvatarInfoList(final int index) {
            return this.showAvatarInfoList_.get(index);
        }
        
        @Override
        public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int index) {
            return this.showAvatarInfoList_.get(index);
        }
        
        @Override
        public List<Integer> getShowNameCardIdListList() {
            return this.showNameCardIdList_;
        }
        
        @Override
        public int getShowNameCardIdListCount() {
            return this.showNameCardIdList_.size();
        }
        
        @Override
        public int getShowNameCardIdList(final int index) {
            return this.showNameCardIdList_.getInt(index);
        }
        
        @Override
        public int getFriendEnterHomeOptionValue() {
            return this.friendEnterHomeOption_;
        }
        
        @Override
        public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption() {
            final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.friendEnterHomeOption_);
            return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasProfilePicture() {
            return this.profilePicture_ != null;
        }
        
        @Override
        public ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
            return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
        }
        
        @Override
        public ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
            return this.getProfilePicture();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.uid_ != 0) {
                output.writeUInt32(1, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nickname_)) {
                GeneratedMessageV3.writeString(output, 2, this.nickname_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(3, this.level_);
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(4, this.avatarId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                GeneratedMessageV3.writeString(output, 5, this.signature_);
            }
            if (this.birthday_ != null) {
                output.writeMessage(6, this.getBirthday());
            }
            if (this.worldLevel_ != 0) {
                output.writeUInt32(7, this.worldLevel_);
            }
            if (this.getReservedListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.reservedListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.reservedList_.size(); ++i) {
                output.writeUInt32NoTag(this.reservedList_.getInt(i));
            }
            if (this.onlineState_ != FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT.getNumber()) {
                output.writeEnum(9, this.onlineState_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(10, this.param_);
            }
            if (this.isFriend_) {
                output.writeBool(11, this.isFriend_);
            }
            if (this.isMpModeAvailable_) {
                output.writeBool(12, this.isMpModeAvailable_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                GeneratedMessageV3.writeString(output, 13, this.onlineId_);
            }
            if (this.nameCardId_ != 0) {
                output.writeUInt32(14, this.nameCardId_);
            }
            if (this.isInBlacklist_) {
                output.writeBool(15, this.isInBlacklist_);
            }
            if (this.isChatNoDisturb_) {
                output.writeBool(16, this.isChatNoDisturb_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.remarkName_)) {
                GeneratedMessageV3.writeString(output, 17, this.remarkName_);
            }
            if (this.finishAchievementNum_ != 0) {
                output.writeUInt32(18, this.finishAchievementNum_);
            }
            if (this.towerFloorIndex_ != 0) {
                output.writeUInt32(19, this.towerFloorIndex_);
            }
            if (this.towerLevelIndex_ != 0) {
                output.writeUInt32(20, this.towerLevelIndex_);
            }
            if (this.isShowAvatar_) {
                output.writeBool(21, this.isShowAvatar_);
            }
            for (int i = 0; i < this.showAvatarInfoList_.size(); ++i) {
                output.writeMessage(22, this.showAvatarInfoList_.get(i));
            }
            if (this.getShowNameCardIdListList().size() > 0) {
                output.writeUInt32NoTag(186);
                output.writeUInt32NoTag(this.showNameCardIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.showNameCardIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.showNameCardIdList_.getInt(i));
            }
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                output.writeEnum(24, this.friendEnterHomeOption_);
            }
            if (this.profilePicture_ != null) {
                output.writeMessage(25, this.getProfilePicture());
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.uid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nickname_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.nickname_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.level_);
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.avatarId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                size += GeneratedMessageV3.computeStringSize(5, this.signature_);
            }
            if (this.birthday_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getBirthday());
            }
            if (this.worldLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.worldLevel_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.reservedList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.reservedList_.getInt(i));
            }
            size += dataSize;
            if (!this.getReservedListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.reservedListMemoizedSerializedSize = dataSize;
            if (this.onlineState_ != FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(9, this.onlineState_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.param_);
            }
            if (this.isFriend_) {
                size += CodedOutputStream.computeBoolSize(11, this.isFriend_);
            }
            if (this.isMpModeAvailable_) {
                size += CodedOutputStream.computeBoolSize(12, this.isMpModeAvailable_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                size += GeneratedMessageV3.computeStringSize(13, this.onlineId_);
            }
            if (this.nameCardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.nameCardId_);
            }
            if (this.isInBlacklist_) {
                size += CodedOutputStream.computeBoolSize(15, this.isInBlacklist_);
            }
            if (this.isChatNoDisturb_) {
                size += CodedOutputStream.computeBoolSize(16, this.isChatNoDisturb_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.remarkName_)) {
                size += GeneratedMessageV3.computeStringSize(17, this.remarkName_);
            }
            if (this.finishAchievementNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(18, this.finishAchievementNum_);
            }
            if (this.towerFloorIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(19, this.towerFloorIndex_);
            }
            if (this.towerLevelIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(20, this.towerLevelIndex_);
            }
            if (this.isShowAvatar_) {
                size += CodedOutputStream.computeBoolSize(21, this.isShowAvatar_);
            }
            for (int j = 0; j < this.showAvatarInfoList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(22, this.showAvatarInfoList_.get(j));
            }
            dataSize = 0;
            for (int i = 0; i < this.showNameCardIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.showNameCardIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getShowNameCardIdListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.showNameCardIdListMemoizedSerializedSize = dataSize;
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                size += CodedOutputStream.computeEnumSize(24, this.friendEnterHomeOption_);
            }
            if (this.profilePicture_ != null) {
                size += CodedOutputStream.computeMessageSize(25, this.getProfilePicture());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SocialDetail)) {
                return super.equals(obj);
            }
            final SocialDetail other = (SocialDetail)obj;
            return this.getUid() == other.getUid() && this.getNickname().equals(other.getNickname()) && this.getLevel() == other.getLevel() && this.getAvatarId() == other.getAvatarId() && this.getSignature().equals(other.getSignature()) && this.hasBirthday() == other.hasBirthday() && (!this.hasBirthday() || this.getBirthday().equals(other.getBirthday())) && this.getWorldLevel() == other.getWorldLevel() && this.getReservedListList().equals(other.getReservedListList()) && this.onlineState_ == other.onlineState_ && this.getParam() == other.getParam() && this.getIsFriend() == other.getIsFriend() && this.getIsMpModeAvailable() == other.getIsMpModeAvailable() && this.getOnlineId().equals(other.getOnlineId()) && this.getNameCardId() == other.getNameCardId() && this.getIsInBlacklist() == other.getIsInBlacklist() && this.getIsChatNoDisturb() == other.getIsChatNoDisturb() && this.getRemarkName().equals(other.getRemarkName()) && this.getFinishAchievementNum() == other.getFinishAchievementNum() && this.getTowerFloorIndex() == other.getTowerFloorIndex() && this.getTowerLevelIndex() == other.getTowerLevelIndex() && this.getIsShowAvatar() == other.getIsShowAvatar() && this.getShowAvatarInfoListList().equals(other.getShowAvatarInfoListList()) && this.getShowNameCardIdListList().equals(other.getShowNameCardIdListList()) && this.friendEnterHomeOption_ == other.friendEnterHomeOption_ && this.hasProfilePicture() == other.hasProfilePicture() && (!this.hasProfilePicture() || this.getProfilePicture().equals(other.getProfilePicture())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getNickname().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getSignature().hashCode();
            if (this.hasBirthday()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getBirthday().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getWorldLevel();
            if (this.getReservedListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getReservedListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.onlineState_;
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getParam();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFriend());
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsMpModeAvailable());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getOnlineId().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getNameCardId();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInBlacklist());
            hash = 37 * hash + 16;
            hash = 53 * hash + Internal.hashBoolean(this.getIsChatNoDisturb());
            hash = 37 * hash + 17;
            hash = 53 * hash + this.getRemarkName().hashCode();
            hash = 37 * hash + 18;
            hash = 53 * hash + this.getFinishAchievementNum();
            hash = 37 * hash + 19;
            hash = 53 * hash + this.getTowerFloorIndex();
            hash = 37 * hash + 20;
            hash = 53 * hash + this.getTowerLevelIndex();
            hash = 37 * hash + 21;
            hash = 53 * hash + Internal.hashBoolean(this.getIsShowAvatar());
            if (this.getShowAvatarInfoListCount() > 0) {
                hash = 37 * hash + 22;
                hash = 53 * hash + this.getShowAvatarInfoListList().hashCode();
            }
            if (this.getShowNameCardIdListCount() > 0) {
                hash = 37 * hash + 23;
                hash = 53 * hash + this.getShowNameCardIdListList().hashCode();
            }
            hash = 37 * hash + 24;
            hash = 53 * hash + this.friendEnterHomeOption_;
            if (this.hasProfilePicture()) {
                hash = 37 * hash + 25;
                hash = 53 * hash + this.getProfilePicture().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SocialDetail parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data);
        }
        
        public static SocialDetail parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialDetail parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data);
        }
        
        public static SocialDetail parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialDetail parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data);
        }
        
        public static SocialDetail parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SocialDetail.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SocialDetail parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialDetail.PARSER, input);
        }
        
        public static SocialDetail parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialDetail.PARSER, input, extensionRegistry);
        }
        
        public static SocialDetail parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SocialDetail.PARSER, input);
        }
        
        public static SocialDetail parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SocialDetail.PARSER, input, extensionRegistry);
        }
        
        public static SocialDetail parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialDetail.PARSER, input);
        }
        
        public static SocialDetail parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SocialDetail.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SocialDetail.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SocialDetail prototype) {
            return SocialDetail.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SocialDetail.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SocialDetail getDefaultInstance() {
            return SocialDetail.DEFAULT_INSTANCE;
        }
        
        public static Parser<SocialDetail> parser() {
            return SocialDetail.PARSER;
        }
        
        @Override
        public Parser<SocialDetail> getParserForType() {
            return SocialDetail.PARSER;
        }
        
        @Override
        public SocialDetail getDefaultInstanceForType() {
            return SocialDetail.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SocialDetail();
            PARSER = new AbstractParser<SocialDetail>() {
                @Override
                public SocialDetail parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SocialDetail(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SocialDetailOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private Object nickname_;
            private int level_;
            private int avatarId_;
            private Object signature_;
            private BirthdayOuterClass.Birthday birthday_;
            private SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder> birthdayBuilder_;
            private int worldLevel_;
            private Internal.IntList reservedList_;
            private int onlineState_;
            private int param_;
            private boolean isFriend_;
            private boolean isMpModeAvailable_;
            private Object onlineId_;
            private int nameCardId_;
            private boolean isInBlacklist_;
            private boolean isChatNoDisturb_;
            private Object remarkName_;
            private int finishAchievementNum_;
            private int towerFloorIndex_;
            private int towerLevelIndex_;
            private boolean isShowAvatar_;
            private List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> showAvatarInfoList_;
            private RepeatedFieldBuilderV3<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> showAvatarInfoListBuilder_;
            private Internal.IntList showNameCardIdList_;
            private int friendEnterHomeOption_;
            private ProfilePictureOuterClass.ProfilePicture profilePicture_;
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SocialDetailOuterClass.internal_static_SocialDetail_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SocialDetailOuterClass.internal_static_SocialDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(SocialDetail.class, Builder.class);
            }
            
            private Builder() {
                this.nickname_ = "";
                this.signature_ = "";
                this.reservedList_ = GeneratedMessageV3.emptyIntList();
                this.onlineState_ = 0;
                this.onlineId_ = "";
                this.remarkName_ = "";
                this.showAvatarInfoList_ = Collections.emptyList();
                this.showNameCardIdList_ = GeneratedMessageV3.emptyIntList();
                this.friendEnterHomeOption_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.nickname_ = "";
                this.signature_ = "";
                this.reservedList_ = GeneratedMessageV3.emptyIntList();
                this.onlineState_ = 0;
                this.onlineId_ = "";
                this.remarkName_ = "";
                this.showAvatarInfoList_ = Collections.emptyList();
                this.showNameCardIdList_ = GeneratedMessageV3.emptyIntList();
                this.friendEnterHomeOption_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SocialDetail.alwaysUseFieldBuilders) {
                    this.getShowAvatarInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                this.nickname_ = "";
                this.level_ = 0;
                this.avatarId_ = 0;
                this.signature_ = "";
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = null;
                }
                else {
                    this.birthday_ = null;
                    this.birthdayBuilder_ = null;
                }
                this.worldLevel_ = 0;
                this.reservedList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onlineState_ = 0;
                this.param_ = 0;
                this.isFriend_ = false;
                this.isMpModeAvailable_ = false;
                this.onlineId_ = "";
                this.nameCardId_ = 0;
                this.isInBlacklist_ = false;
                this.isChatNoDisturb_ = false;
                this.remarkName_ = "";
                this.finishAchievementNum_ = 0;
                this.towerFloorIndex_ = 0;
                this.towerLevelIndex_ = 0;
                this.isShowAvatar_ = false;
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.showAvatarInfoListBuilder_.clear();
                }
                this.showNameCardIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.friendEnterHomeOption_ = 0;
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SocialDetailOuterClass.internal_static_SocialDetail_descriptor;
            }
            
            @Override
            public SocialDetail getDefaultInstanceForType() {
                return SocialDetail.getDefaultInstance();
            }
            
            @Override
            public SocialDetail build() {
                final SocialDetail result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SocialDetail buildPartial() {
                final SocialDetail result = new SocialDetail(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                result.nickname_ = this.nickname_;
                result.level_ = this.level_;
                result.avatarId_ = this.avatarId_;
                result.signature_ = this.signature_;
                if (this.birthdayBuilder_ == null) {
                    result.birthday_ = this.birthday_;
                }
                else {
                    result.birthday_ = this.birthdayBuilder_.build();
                }
                result.worldLevel_ = this.worldLevel_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.reservedList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.reservedList_ = this.reservedList_;
                result.onlineState_ = this.onlineState_;
                result.param_ = this.param_;
                result.isFriend_ = this.isFriend_;
                result.isMpModeAvailable_ = this.isMpModeAvailable_;
                result.onlineId_ = this.onlineId_;
                result.nameCardId_ = this.nameCardId_;
                result.isInBlacklist_ = this.isInBlacklist_;
                result.isChatNoDisturb_ = this.isChatNoDisturb_;
                result.remarkName_ = this.remarkName_;
                result.finishAchievementNum_ = this.finishAchievementNum_;
                result.towerFloorIndex_ = this.towerFloorIndex_;
                result.towerLevelIndex_ = this.towerLevelIndex_;
                result.isShowAvatar_ = this.isShowAvatar_;
                if (this.showAvatarInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>)this.showAvatarInfoList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.showAvatarInfoList_ = this.showAvatarInfoList_;
                }
                else {
                    result.showAvatarInfoList_ = this.showAvatarInfoListBuilder_.build();
                }
                if ((this.bitField0_ & 0x4) != 0x0) {
                    this.showNameCardIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                result.showNameCardIdList_ = this.showNameCardIdList_;
                result.friendEnterHomeOption_ = this.friendEnterHomeOption_;
                if (this.profilePictureBuilder_ == null) {
                    result.profilePicture_ = this.profilePicture_;
                }
                else {
                    result.profilePicture_ = this.profilePictureBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SocialDetail) {
                    return this.mergeFrom((SocialDetail)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SocialDetail other) {
                if (other == SocialDetail.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (!other.getNickname().isEmpty()) {
                    this.nickname_ = other.nickname_;
                    this.onChanged();
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (!other.getSignature().isEmpty()) {
                    this.signature_ = other.signature_;
                    this.onChanged();
                }
                if (other.hasBirthday()) {
                    this.mergeBirthday(other.getBirthday());
                }
                if (other.getWorldLevel() != 0) {
                    this.setWorldLevel(other.getWorldLevel());
                }
                if (!other.reservedList_.isEmpty()) {
                    if (this.reservedList_.isEmpty()) {
                        this.reservedList_ = other.reservedList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureReservedListIsMutable();
                        this.reservedList_.addAll(other.reservedList_);
                    }
                    this.onChanged();
                }
                if (other.onlineState_ != 0) {
                    this.setOnlineStateValue(other.getOnlineStateValue());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (other.getIsFriend()) {
                    this.setIsFriend(other.getIsFriend());
                }
                if (other.getIsMpModeAvailable()) {
                    this.setIsMpModeAvailable(other.getIsMpModeAvailable());
                }
                if (!other.getOnlineId().isEmpty()) {
                    this.onlineId_ = other.onlineId_;
                    this.onChanged();
                }
                if (other.getNameCardId() != 0) {
                    this.setNameCardId(other.getNameCardId());
                }
                if (other.getIsInBlacklist()) {
                    this.setIsInBlacklist(other.getIsInBlacklist());
                }
                if (other.getIsChatNoDisturb()) {
                    this.setIsChatNoDisturb(other.getIsChatNoDisturb());
                }
                if (!other.getRemarkName().isEmpty()) {
                    this.remarkName_ = other.remarkName_;
                    this.onChanged();
                }
                if (other.getFinishAchievementNum() != 0) {
                    this.setFinishAchievementNum(other.getFinishAchievementNum());
                }
                if (other.getTowerFloorIndex() != 0) {
                    this.setTowerFloorIndex(other.getTowerFloorIndex());
                }
                if (other.getTowerLevelIndex() != 0) {
                    this.setTowerLevelIndex(other.getTowerLevelIndex());
                }
                if (other.getIsShowAvatar()) {
                    this.setIsShowAvatar(other.getIsShowAvatar());
                }
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (!other.showAvatarInfoList_.isEmpty()) {
                        if (this.showAvatarInfoList_.isEmpty()) {
                            this.showAvatarInfoList_ = other.showAvatarInfoList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureShowAvatarInfoListIsMutable();
                            this.showAvatarInfoList_.addAll(other.showAvatarInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.showAvatarInfoList_.isEmpty()) {
                    if (this.showAvatarInfoListBuilder_.isEmpty()) {
                        this.showAvatarInfoListBuilder_.dispose();
                        this.showAvatarInfoListBuilder_ = null;
                        this.showAvatarInfoList_ = other.showAvatarInfoList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.showAvatarInfoListBuilder_ = (SocialDetail.alwaysUseFieldBuilders ? this.getShowAvatarInfoListFieldBuilder() : null);
                    }
                    else {
                        this.showAvatarInfoListBuilder_.addAllMessages(other.showAvatarInfoList_);
                    }
                }
                if (!other.showNameCardIdList_.isEmpty()) {
                    if (this.showNameCardIdList_.isEmpty()) {
                        this.showNameCardIdList_ = other.showNameCardIdList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    else {
                        this.ensureShowNameCardIdListIsMutable();
                        this.showNameCardIdList_.addAll(other.showNameCardIdList_);
                    }
                    this.onChanged();
                }
                if (other.friendEnterHomeOption_ != 0) {
                    this.setFriendEnterHomeOptionValue(other.getFriendEnterHomeOptionValue());
                }
                if (other.hasProfilePicture()) {
                    this.mergeProfilePicture(other.getProfilePicture());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SocialDetail parsedMessage = null;
                try {
                    parsedMessage = SocialDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SocialDetail)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getNickname() {
                final Object ref = this.nickname_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.nickname_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNicknameBytes() {
                final Object ref = this.nickname_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.nickname_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setNickname(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.nickname_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNickname() {
                this.nickname_ = SocialDetail.getDefaultInstance().getNickname();
                this.onChanged();
                return this;
            }
            
            public Builder setNicknameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.nickname_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAvatarId() {
                return this.avatarId_;
            }
            
            public Builder setAvatarId(final int value) {
                this.avatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarId() {
                this.avatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getSignature() {
                final Object ref = this.signature_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.signature_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSignatureBytes() {
                final Object ref = this.signature_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.signature_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSignature(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.signature_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSignature() {
                this.signature_ = SocialDetail.getDefaultInstance().getSignature();
                this.onChanged();
                return this;
            }
            
            public Builder setSignatureBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.signature_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasBirthday() {
                return this.birthdayBuilder_ != null || this.birthday_ != null;
            }
            
            @Override
            public BirthdayOuterClass.Birthday getBirthday() {
                if (this.birthdayBuilder_ == null) {
                    return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
                }
                return this.birthdayBuilder_.getMessage();
            }
            
            public Builder setBirthday(final BirthdayOuterClass.Birthday value) {
                if (this.birthdayBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.birthday_ = value;
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBirthday(final BirthdayOuterClass.Birthday.Builder builderForValue) {
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBirthday(final BirthdayOuterClass.Birthday value) {
                if (this.birthdayBuilder_ == null) {
                    if (this.birthday_ != null) {
                        this.birthday_ = BirthdayOuterClass.Birthday.newBuilder(this.birthday_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.birthday_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.birthdayBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBirthday() {
                if (this.birthdayBuilder_ == null) {
                    this.birthday_ = null;
                    this.onChanged();
                }
                else {
                    this.birthday_ = null;
                    this.birthdayBuilder_ = null;
                }
                return this;
            }
            
            public BirthdayOuterClass.Birthday.Builder getBirthdayBuilder() {
                this.onChanged();
                return this.getBirthdayFieldBuilder().getBuilder();
            }
            
            @Override
            public BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
                if (this.birthdayBuilder_ != null) {
                    return this.birthdayBuilder_.getMessageOrBuilder();
                }
                return (this.birthday_ == null) ? BirthdayOuterClass.Birthday.getDefaultInstance() : this.birthday_;
            }
            
            private SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder> getBirthdayFieldBuilder() {
                if (this.birthdayBuilder_ == null) {
                    this.birthdayBuilder_ = new SingleFieldBuilderV3<BirthdayOuterClass.Birthday, BirthdayOuterClass.Birthday.Builder, BirthdayOuterClass.BirthdayOrBuilder>(this.getBirthday(), this.getParentForChildren(), this.isClean());
                    this.birthday_ = null;
                }
                return this.birthdayBuilder_;
            }
            
            @Override
            public int getWorldLevel() {
                return this.worldLevel_;
            }
            
            public Builder setWorldLevel(final int value) {
                this.worldLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWorldLevel() {
                this.worldLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureReservedListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.reservedList_ = GeneratedMessageV3.mutableCopy(this.reservedList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getReservedListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.reservedList_) : this.reservedList_;
            }
            
            @Override
            public int getReservedListCount() {
                return this.reservedList_.size();
            }
            
            @Override
            public int getReservedList(final int index) {
                return this.reservedList_.getInt(index);
            }
            
            public Builder setReservedList(final int index, final int value) {
                this.ensureReservedListIsMutable();
                this.reservedList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addReservedList(final int value) {
                this.ensureReservedListIsMutable();
                this.reservedList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllReservedList(final Iterable<? extends Integer> values) {
                this.ensureReservedListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.reservedList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearReservedList() {
                this.reservedList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOnlineStateValue() {
                return this.onlineState_;
            }
            
            public Builder setOnlineStateValue(final int value) {
                this.onlineState_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FriendOnlineStateOuterClass.FriendOnlineState getOnlineState() {
                final FriendOnlineStateOuterClass.FriendOnlineState result = FriendOnlineStateOuterClass.FriendOnlineState.valueOf(this.onlineState_);
                return (result == null) ? FriendOnlineStateOuterClass.FriendOnlineState.UNRECOGNIZED : result;
            }
            
            public Builder setOnlineState(final FriendOnlineStateOuterClass.FriendOnlineState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.onlineState_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOnlineState() {
                this.onlineState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParam() {
                return this.param_;
            }
            
            public Builder setParam(final int value) {
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParam() {
                this.param_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFriend() {
                return this.isFriend_;
            }
            
            public Builder setIsFriend(final boolean value) {
                this.isFriend_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFriend() {
                this.isFriend_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsMpModeAvailable() {
                return this.isMpModeAvailable_;
            }
            
            public Builder setIsMpModeAvailable(final boolean value) {
                this.isMpModeAvailable_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsMpModeAvailable() {
                this.isMpModeAvailable_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getOnlineId() {
                final Object ref = this.onlineId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.onlineId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getOnlineIdBytes() {
                final Object ref = this.onlineId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.onlineId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setOnlineId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.onlineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOnlineId() {
                this.onlineId_ = SocialDetail.getDefaultInstance().getOnlineId();
                this.onChanged();
                return this;
            }
            
            public Builder setOnlineIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.onlineId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNameCardId() {
                return this.nameCardId_;
            }
            
            public Builder setNameCardId(final int value) {
                this.nameCardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNameCardId() {
                this.nameCardId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsInBlacklist() {
                return this.isInBlacklist_;
            }
            
            public Builder setIsInBlacklist(final boolean value) {
                this.isInBlacklist_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInBlacklist() {
                this.isInBlacklist_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsChatNoDisturb() {
                return this.isChatNoDisturb_;
            }
            
            public Builder setIsChatNoDisturb(final boolean value) {
                this.isChatNoDisturb_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsChatNoDisturb() {
                this.isChatNoDisturb_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getRemarkName() {
                final Object ref = this.remarkName_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.remarkName_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getRemarkNameBytes() {
                final Object ref = this.remarkName_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.remarkName_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setRemarkName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.remarkName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRemarkName() {
                this.remarkName_ = SocialDetail.getDefaultInstance().getRemarkName();
                this.onChanged();
                return this;
            }
            
            public Builder setRemarkNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.remarkName_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFinishAchievementNum() {
                return this.finishAchievementNum_;
            }
            
            public Builder setFinishAchievementNum(final int value) {
                this.finishAchievementNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishAchievementNum() {
                this.finishAchievementNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTowerFloorIndex() {
                return this.towerFloorIndex_;
            }
            
            public Builder setTowerFloorIndex(final int value) {
                this.towerFloorIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerFloorIndex() {
                this.towerFloorIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTowerLevelIndex() {
                return this.towerLevelIndex_;
            }
            
            public Builder setTowerLevelIndex(final int value) {
                this.towerLevelIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerLevelIndex() {
                this.towerLevelIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsShowAvatar() {
                return this.isShowAvatar_;
            }
            
            public Builder setIsShowAvatar(final boolean value) {
                this.isShowAvatar_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsShowAvatar() {
                this.isShowAvatar_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureShowAvatarInfoListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.showAvatarInfoList_ = new ArrayList<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>(this.showAvatarInfoList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> getShowAvatarInfoListList() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>)this.showAvatarInfoList_);
                }
                return this.showAvatarInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getShowAvatarInfoListCount() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.size();
                }
                return this.showAvatarInfoListBuilder_.getCount();
            }
            
            @Override
            public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getShowAvatarInfoList(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.get(index);
                }
                return this.showAvatarInfoListBuilder_.getMessage(index);
            }
            
            public Builder setShowAvatarInfoList(final int index, final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setShowAvatarInfoList(final int index, final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final int index, final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final int index, final SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllShowAvatarInfoList(final Iterable<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> values) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.showAvatarInfoList_);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearShowAvatarInfoList() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeShowAvatarInfoList(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder getShowAvatarInfoListBuilder(final int index) {
                return this.getShowAvatarInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.get(index);
                }
                return this.showAvatarInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList() {
                if (this.showAvatarInfoListBuilder_ != null) {
                    return this.showAvatarInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder>)this.showAvatarInfoList_);
            }
            
            public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder addShowAvatarInfoListBuilder() {
                return this.getShowAvatarInfoListFieldBuilder().addBuilder(SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.getDefaultInstance());
            }
            
            public SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder addShowAvatarInfoListBuilder(final int index) {
                return this.getShowAvatarInfoListFieldBuilder().addBuilder(index, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.getDefaultInstance());
            }
            
            public List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder> getShowAvatarInfoListBuilderList() {
                return this.getShowAvatarInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> getShowAvatarInfoListFieldBuilder() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoListBuilder_ = new RepeatedFieldBuilderV3<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder>(this.showAvatarInfoList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.showAvatarInfoList_ = null;
                }
                return this.showAvatarInfoListBuilder_;
            }
            
            private void ensureShowNameCardIdListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.showNameCardIdList_ = GeneratedMessageV3.mutableCopy(this.showNameCardIdList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<Integer> getShowNameCardIdListList() {
                return ((this.bitField0_ & 0x4) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.showNameCardIdList_) : this.showNameCardIdList_;
            }
            
            @Override
            public int getShowNameCardIdListCount() {
                return this.showNameCardIdList_.size();
            }
            
            @Override
            public int getShowNameCardIdList(final int index) {
                return this.showNameCardIdList_.getInt(index);
            }
            
            public Builder setShowNameCardIdList(final int index, final int value) {
                this.ensureShowNameCardIdListIsMutable();
                this.showNameCardIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addShowNameCardIdList(final int value) {
                this.ensureShowNameCardIdListIsMutable();
                this.showNameCardIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllShowNameCardIdList(final Iterable<? extends Integer> values) {
                this.ensureShowNameCardIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.showNameCardIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearShowNameCardIdList() {
                this.showNameCardIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFB;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFriendEnterHomeOptionValue() {
                return this.friendEnterHomeOption_;
            }
            
            public Builder setFriendEnterHomeOptionValue(final int value) {
                this.friendEnterHomeOption_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption() {
                final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.friendEnterHomeOption_);
                return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
            }
            
            public Builder setFriendEnterHomeOption(final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.friendEnterHomeOption_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearFriendEnterHomeOption() {
                this.friendEnterHomeOption_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasProfilePicture() {
                return this.profilePictureBuilder_ != null || this.profilePicture_ != null;
            }
            
            @Override
            public ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
                if (this.profilePictureBuilder_ == null) {
                    return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
                }
                return this.profilePictureBuilder_.getMessage();
            }
            
            public Builder setProfilePicture(final ProfilePictureOuterClass.ProfilePicture value) {
                if (this.profilePictureBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.profilePicture_ = value;
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setProfilePicture(final ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeProfilePicture(final ProfilePictureOuterClass.ProfilePicture value) {
                if (this.profilePictureBuilder_ == null) {
                    if (this.profilePicture_ != null) {
                        this.profilePicture_ = ProfilePictureOuterClass.ProfilePicture.newBuilder(this.profilePicture_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.profilePicture_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.profilePictureBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearProfilePicture() {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                    this.onChanged();
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                return this;
            }
            
            public ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
                this.onChanged();
                return this.getProfilePictureFieldBuilder().getBuilder();
            }
            
            @Override
            public ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
                if (this.profilePictureBuilder_ != null) {
                    return this.profilePictureBuilder_.getMessageOrBuilder();
                }
                return (this.profilePicture_ == null) ? ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : this.profilePicture_;
            }
            
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> getProfilePictureFieldBuilder() {
                if (this.profilePictureBuilder_ == null) {
                    this.profilePictureBuilder_ = new SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder>(this.getProfilePicture(), this.getParentForChildren(), this.isClean());
                    this.profilePicture_ = null;
                }
                return this.profilePictureBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SocialDetailOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        String getNickname();
        
        ByteString getNicknameBytes();
        
        int getLevel();
        
        int getAvatarId();
        
        String getSignature();
        
        ByteString getSignatureBytes();
        
        boolean hasBirthday();
        
        BirthdayOuterClass.Birthday getBirthday();
        
        BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder();
        
        int getWorldLevel();
        
        List<Integer> getReservedListList();
        
        int getReservedListCount();
        
        int getReservedList(final int p0);
        
        int getOnlineStateValue();
        
        FriendOnlineStateOuterClass.FriendOnlineState getOnlineState();
        
        int getParam();
        
        boolean getIsFriend();
        
        boolean getIsMpModeAvailable();
        
        String getOnlineId();
        
        ByteString getOnlineIdBytes();
        
        int getNameCardId();
        
        boolean getIsInBlacklist();
        
        boolean getIsChatNoDisturb();
        
        String getRemarkName();
        
        ByteString getRemarkNameBytes();
        
        int getFinishAchievementNum();
        
        int getTowerFloorIndex();
        
        int getTowerLevelIndex();
        
        boolean getIsShowAvatar();
        
        List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> getShowAvatarInfoListList();
        
        SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getShowAvatarInfoList(final int p0);
        
        int getShowAvatarInfoListCount();
        
        List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList();
        
        SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int p0);
        
        List<Integer> getShowNameCardIdListList();
        
        int getShowNameCardIdListCount();
        
        int getShowNameCardIdList(final int p0);
        
        int getFriendEnterHomeOptionValue();
        
        FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption();
        
        boolean hasProfilePicture();
        
        ProfilePictureOuterClass.ProfilePicture getProfilePicture();
        
        ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();
    }
}
