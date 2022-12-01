// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class FriendBriefOuterClass
{
    private static final Descriptors.Descriptor internal_static_FriendBrief_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FriendBrief_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FriendBriefOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FriendBriefOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011FriendBrief.proto\u001a\u001bFriendEnterHomeOption.proto\u001a\u0017FriendOnlineState.proto\u001a\u0012PlatformType.proto\u001a\u0014ProfilePicture.proto\u001a\u001aSocialShowAvatarInfo.proto\"\u00de\u0004\n\u000bFriendBrief\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\r\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\r\n\u0005level\u0018\u0003 \u0001(\r\u0012\u0011\n\tavatar_id\u0018\u0004 \u0001(\r\u0012\u0013\n\u000bworld_level\u0018\u0005 \u0001(\r\u0012\u0011\n\tsignature\u0018\u0006 \u0001(\t\u0012(\n\fonline_state\u0018\u0007 \u0001(\u000e2\u0012.FriendOnlineState\u0012\r\n\u0005param\u0018\b \u0001(\r\u0012\u001c\n\u0014is_mp_mode_available\u0018\n \u0001(\b\u0012\u0011\n\tonline_id\u0018\u000b \u0001(\t\u0012\u0018\n\u0010last_active_time\u0018\f \u0001(\r\u0012\u0014\n\fname_card_id\u0018\r \u0001(\r\u0012\u0015\n\rmp_player_num\u0018\u000e \u0001(\r\u0012\u001a\n\u0012is_chat_no_disturb\u0018\u000f \u0001(\b\u0012\u0015\n\rchat_sequence\u0018\u0010 \u0001(\r\u0012\u0013\n\u000bremark_name\u0018\u0011 \u0001(\t\u00124\n\u0015show_avatar_info_list\u0018\u0016 \u0003(\u000b2\u0015.SocialShowAvatarInfo\u00128\n\u0018friend_enter_home_option\u0018\u0017 \u0001(\u000e2\u0016.FriendEnterHomeOption\u0012(\n\u000fprofile_picture\u0018\u0018 \u0001(\u000b2\u000f.ProfilePicture\u0012\u0016\n\u000eis_game_source\u0018\u0019 \u0001(\b\u0012\u0015\n\ris_psn_source\u0018\u001a \u0001(\b\u0012$\n\rplatform_type\u0018\u001b \u0001(\u000e2\r.PlatformTypeB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FriendBriefOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FriendEnterHomeOptionOuterClass.getDescriptor(), FriendOnlineStateOuterClass.getDescriptor(), PlatformTypeOuterClass.getDescriptor(), ProfilePictureOuterClass.getDescriptor(), SocialShowAvatarInfoOuterClass.getDescriptor() });
        internal_static_FriendBrief_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FriendBrief_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FriendBriefOuterClass.internal_static_FriendBrief_descriptor, new String[] { "Uid", "Nickname", "Level", "AvatarId", "WorldLevel", "Signature", "OnlineState", "Param", "IsMpModeAvailable", "OnlineId", "LastActiveTime", "NameCardId", "MpPlayerNum", "IsChatNoDisturb", "ChatSequence", "RemarkName", "ShowAvatarInfoList", "FriendEnterHomeOption", "ProfilePicture", "IsGameSource", "IsPsnSource", "PlatformType" });
        FriendEnterHomeOptionOuterClass.getDescriptor();
        FriendOnlineStateOuterClass.getDescriptor();
        PlatformTypeOuterClass.getDescriptor();
        ProfilePictureOuterClass.getDescriptor();
        SocialShowAvatarInfoOuterClass.getDescriptor();
    }
    
    public static final class FriendBrief extends GeneratedMessageV3 implements FriendBriefOrBuilder
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
        public static final int WORLD_LEVEL_FIELD_NUMBER = 5;
        private int worldLevel_;
        public static final int SIGNATURE_FIELD_NUMBER = 6;
        private volatile Object signature_;
        public static final int ONLINE_STATE_FIELD_NUMBER = 7;
        private int onlineState_;
        public static final int PARAM_FIELD_NUMBER = 8;
        private int param_;
        public static final int IS_MP_MODE_AVAILABLE_FIELD_NUMBER = 10;
        private boolean isMpModeAvailable_;
        public static final int ONLINE_ID_FIELD_NUMBER = 11;
        private volatile Object onlineId_;
        public static final int LAST_ACTIVE_TIME_FIELD_NUMBER = 12;
        private int lastActiveTime_;
        public static final int NAME_CARD_ID_FIELD_NUMBER = 13;
        private int nameCardId_;
        public static final int MP_PLAYER_NUM_FIELD_NUMBER = 14;
        private int mpPlayerNum_;
        public static final int IS_CHAT_NO_DISTURB_FIELD_NUMBER = 15;
        private boolean isChatNoDisturb_;
        public static final int CHAT_SEQUENCE_FIELD_NUMBER = 16;
        private int chatSequence_;
        public static final int REMARK_NAME_FIELD_NUMBER = 17;
        private volatile Object remarkName_;
        public static final int SHOW_AVATAR_INFO_LIST_FIELD_NUMBER = 22;
        private List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> showAvatarInfoList_;
        public static final int FRIEND_ENTER_HOME_OPTION_FIELD_NUMBER = 23;
        private int friendEnterHomeOption_;
        public static final int PROFILE_PICTURE_FIELD_NUMBER = 24;
        private ProfilePictureOuterClass.ProfilePicture profilePicture_;
        public static final int IS_GAME_SOURCE_FIELD_NUMBER = 25;
        private boolean isGameSource_;
        public static final int IS_PSN_SOURCE_FIELD_NUMBER = 26;
        private boolean isPsnSource_;
        public static final int PLATFORM_TYPE_FIELD_NUMBER = 27;
        private int platformType_;
        private byte memoizedIsInitialized;
        private static final FriendBrief DEFAULT_INSTANCE;
        private static final Parser<FriendBrief> PARSER;
        
        private FriendBrief(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FriendBrief() {
            this.memoizedIsInitialized = -1;
            this.nickname_ = "";
            this.signature_ = "";
            this.onlineState_ = 0;
            this.onlineId_ = "";
            this.remarkName_ = "";
            this.showAvatarInfoList_ = Collections.emptyList();
            this.friendEnterHomeOption_ = 0;
            this.platformType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FriendBrief();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FriendBrief(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.worldLevel_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            final String s = input.readStringRequireUtf8();
                            this.signature_ = s;
                            continue;
                        }
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.onlineState_ = rawValue;
                            continue;
                        }
                        case 64: {
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.isMpModeAvailable_ = input.readBool();
                            continue;
                        }
                        case 90: {
                            final String s = input.readStringRequireUtf8();
                            this.onlineId_ = s;
                            continue;
                        }
                        case 96: {
                            this.lastActiveTime_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.nameCardId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.mpPlayerNum_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.isChatNoDisturb_ = input.readBool();
                            continue;
                        }
                        case 128: {
                            this.chatSequence_ = input.readUInt32();
                            continue;
                        }
                        case 138: {
                            final String s = input.readStringRequireUtf8();
                            this.remarkName_ = s;
                            continue;
                        }
                        case 178: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.showAvatarInfoList_ = new ArrayList<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.showAvatarInfoList_.add(input.readMessage(SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 184: {
                            final int rawValue = input.readEnum();
                            this.friendEnterHomeOption_ = rawValue;
                            continue;
                        }
                        case 194: {
                            ProfilePictureOuterClass.ProfilePicture.Builder subBuilder = null;
                            if (this.profilePicture_ != null) {
                                subBuilder = this.profilePicture_.toBuilder();
                            }
                            this.profilePicture_ = input.readMessage(ProfilePictureOuterClass.ProfilePicture.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.profilePicture_);
                                this.profilePicture_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 200: {
                            this.isGameSource_ = input.readBool();
                            continue;
                        }
                        case 208: {
                            this.isPsnSource_ = input.readBool();
                            continue;
                        }
                        case 216: {
                            final int rawValue = input.readEnum();
                            this.platformType_ = rawValue;
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
                    this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>)this.showAvatarInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FriendBriefOuterClass.internal_static_FriendBrief_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FriendBriefOuterClass.internal_static_FriendBrief_fieldAccessorTable.ensureFieldAccessorsInitialized(FriendBrief.class, Builder.class);
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
        public int getWorldLevel() {
            return this.worldLevel_;
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
        public int getLastActiveTime() {
            return this.lastActiveTime_;
        }
        
        @Override
        public int getNameCardId() {
            return this.nameCardId_;
        }
        
        @Override
        public int getMpPlayerNum() {
            return this.mpPlayerNum_;
        }
        
        @Override
        public boolean getIsChatNoDisturb() {
            return this.isChatNoDisturb_;
        }
        
        @Override
        public int getChatSequence() {
            return this.chatSequence_;
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
        public boolean getIsGameSource() {
            return this.isGameSource_;
        }
        
        @Override
        public boolean getIsPsnSource() {
            return this.isPsnSource_;
        }
        
        @Override
        public int getPlatformTypeValue() {
            return this.platformType_;
        }
        
        @Override
        public PlatformTypeOuterClass.PlatformType getPlatformType() {
            final PlatformTypeOuterClass.PlatformType result = PlatformTypeOuterClass.PlatformType.valueOf(this.platformType_);
            return (result == null) ? PlatformTypeOuterClass.PlatformType.UNRECOGNIZED : result;
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
            if (this.worldLevel_ != 0) {
                output.writeUInt32(5, this.worldLevel_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                GeneratedMessageV3.writeString(output, 6, this.signature_);
            }
            if (this.onlineState_ != FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT.getNumber()) {
                output.writeEnum(7, this.onlineState_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(8, this.param_);
            }
            if (this.isMpModeAvailable_) {
                output.writeBool(10, this.isMpModeAvailable_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                GeneratedMessageV3.writeString(output, 11, this.onlineId_);
            }
            if (this.lastActiveTime_ != 0) {
                output.writeUInt32(12, this.lastActiveTime_);
            }
            if (this.nameCardId_ != 0) {
                output.writeUInt32(13, this.nameCardId_);
            }
            if (this.mpPlayerNum_ != 0) {
                output.writeUInt32(14, this.mpPlayerNum_);
            }
            if (this.isChatNoDisturb_) {
                output.writeBool(15, this.isChatNoDisturb_);
            }
            if (this.chatSequence_ != 0) {
                output.writeUInt32(16, this.chatSequence_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.remarkName_)) {
                GeneratedMessageV3.writeString(output, 17, this.remarkName_);
            }
            for (int i = 0; i < this.showAvatarInfoList_.size(); ++i) {
                output.writeMessage(22, this.showAvatarInfoList_.get(i));
            }
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                output.writeEnum(23, this.friendEnterHomeOption_);
            }
            if (this.profilePicture_ != null) {
                output.writeMessage(24, this.getProfilePicture());
            }
            if (this.isGameSource_) {
                output.writeBool(25, this.isGameSource_);
            }
            if (this.isPsnSource_) {
                output.writeBool(26, this.isPsnSource_);
            }
            if (this.platformType_ != PlatformTypeOuterClass.PlatformType.PLATFORM_TYPE_EDITOR.getNumber()) {
                output.writeEnum(27, this.platformType_);
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
            if (this.worldLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.worldLevel_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                size += GeneratedMessageV3.computeStringSize(6, this.signature_);
            }
            if (this.onlineState_ != FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_FREIEND_DISCONNECT.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.onlineState_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.param_);
            }
            if (this.isMpModeAvailable_) {
                size += CodedOutputStream.computeBoolSize(10, this.isMpModeAvailable_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                size += GeneratedMessageV3.computeStringSize(11, this.onlineId_);
            }
            if (this.lastActiveTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.lastActiveTime_);
            }
            if (this.nameCardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.nameCardId_);
            }
            if (this.mpPlayerNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.mpPlayerNum_);
            }
            if (this.isChatNoDisturb_) {
                size += CodedOutputStream.computeBoolSize(15, this.isChatNoDisturb_);
            }
            if (this.chatSequence_ != 0) {
                size += CodedOutputStream.computeUInt32Size(16, this.chatSequence_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.remarkName_)) {
                size += GeneratedMessageV3.computeStringSize(17, this.remarkName_);
            }
            for (int i = 0; i < this.showAvatarInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(22, this.showAvatarInfoList_.get(i));
            }
            if (this.friendEnterHomeOption_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                size += CodedOutputStream.computeEnumSize(23, this.friendEnterHomeOption_);
            }
            if (this.profilePicture_ != null) {
                size += CodedOutputStream.computeMessageSize(24, this.getProfilePicture());
            }
            if (this.isGameSource_) {
                size += CodedOutputStream.computeBoolSize(25, this.isGameSource_);
            }
            if (this.isPsnSource_) {
                size += CodedOutputStream.computeBoolSize(26, this.isPsnSource_);
            }
            if (this.platformType_ != PlatformTypeOuterClass.PlatformType.PLATFORM_TYPE_EDITOR.getNumber()) {
                size += CodedOutputStream.computeEnumSize(27, this.platformType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FriendBrief)) {
                return super.equals(obj);
            }
            final FriendBrief other = (FriendBrief)obj;
            return this.getUid() == other.getUid() && this.getNickname().equals(other.getNickname()) && this.getLevel() == other.getLevel() && this.getAvatarId() == other.getAvatarId() && this.getWorldLevel() == other.getWorldLevel() && this.getSignature().equals(other.getSignature()) && this.onlineState_ == other.onlineState_ && this.getParam() == other.getParam() && this.getIsMpModeAvailable() == other.getIsMpModeAvailable() && this.getOnlineId().equals(other.getOnlineId()) && this.getLastActiveTime() == other.getLastActiveTime() && this.getNameCardId() == other.getNameCardId() && this.getMpPlayerNum() == other.getMpPlayerNum() && this.getIsChatNoDisturb() == other.getIsChatNoDisturb() && this.getChatSequence() == other.getChatSequence() && this.getRemarkName().equals(other.getRemarkName()) && this.getShowAvatarInfoListList().equals(other.getShowAvatarInfoListList()) && this.friendEnterHomeOption_ == other.friendEnterHomeOption_ && this.hasProfilePicture() == other.hasProfilePicture() && (!this.hasProfilePicture() || this.getProfilePicture().equals(other.getProfilePicture())) && this.getIsGameSource() == other.getIsGameSource() && this.getIsPsnSource() == other.getIsPsnSource() && this.platformType_ == other.platformType_ && this.unknownFields.equals(other.unknownFields);
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
            hash = 53 * hash + this.getWorldLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getSignature().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.onlineState_;
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getParam();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsMpModeAvailable());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getOnlineId().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getLastActiveTime();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getNameCardId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getMpPlayerNum();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsChatNoDisturb());
            hash = 37 * hash + 16;
            hash = 53 * hash + this.getChatSequence();
            hash = 37 * hash + 17;
            hash = 53 * hash + this.getRemarkName().hashCode();
            if (this.getShowAvatarInfoListCount() > 0) {
                hash = 37 * hash + 22;
                hash = 53 * hash + this.getShowAvatarInfoListList().hashCode();
            }
            hash = 37 * hash + 23;
            hash = 53 * hash + this.friendEnterHomeOption_;
            if (this.hasProfilePicture()) {
                hash = 37 * hash + 24;
                hash = 53 * hash + this.getProfilePicture().hashCode();
            }
            hash = 37 * hash + 25;
            hash = 53 * hash + Internal.hashBoolean(this.getIsGameSource());
            hash = 37 * hash + 26;
            hash = 53 * hash + Internal.hashBoolean(this.getIsPsnSource());
            hash = 37 * hash + 27;
            hash = 53 * hash + this.platformType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FriendBrief parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data);
        }
        
        public static FriendBrief parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FriendBrief parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data);
        }
        
        public static FriendBrief parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FriendBrief parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data);
        }
        
        public static FriendBrief parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FriendBrief.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FriendBrief parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FriendBrief.PARSER, input);
        }
        
        public static FriendBrief parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FriendBrief.PARSER, input, extensionRegistry);
        }
        
        public static FriendBrief parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FriendBrief.PARSER, input);
        }
        
        public static FriendBrief parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FriendBrief.PARSER, input, extensionRegistry);
        }
        
        public static FriendBrief parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FriendBrief.PARSER, input);
        }
        
        public static FriendBrief parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FriendBrief.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FriendBrief.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FriendBrief prototype) {
            return FriendBrief.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FriendBrief.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FriendBrief getDefaultInstance() {
            return FriendBrief.DEFAULT_INSTANCE;
        }
        
        public static Parser<FriendBrief> parser() {
            return FriendBrief.PARSER;
        }
        
        @Override
        public Parser<FriendBrief> getParserForType() {
            return FriendBrief.PARSER;
        }
        
        @Override
        public FriendBrief getDefaultInstanceForType() {
            return FriendBrief.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FriendBrief();
            PARSER = new AbstractParser<FriendBrief>() {
                @Override
                public FriendBrief parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FriendBrief(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FriendBriefOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private Object nickname_;
            private int level_;
            private int avatarId_;
            private int worldLevel_;
            private Object signature_;
            private int onlineState_;
            private int param_;
            private boolean isMpModeAvailable_;
            private Object onlineId_;
            private int lastActiveTime_;
            private int nameCardId_;
            private int mpPlayerNum_;
            private boolean isChatNoDisturb_;
            private int chatSequence_;
            private Object remarkName_;
            private List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> showAvatarInfoList_;
            private RepeatedFieldBuilderV3<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> showAvatarInfoListBuilder_;
            private int friendEnterHomeOption_;
            private ProfilePictureOuterClass.ProfilePicture profilePicture_;
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
            private boolean isGameSource_;
            private boolean isPsnSource_;
            private int platformType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FriendBriefOuterClass.internal_static_FriendBrief_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FriendBriefOuterClass.internal_static_FriendBrief_fieldAccessorTable.ensureFieldAccessorsInitialized(FriendBrief.class, Builder.class);
            }
            
            private Builder() {
                this.nickname_ = "";
                this.signature_ = "";
                this.onlineState_ = 0;
                this.onlineId_ = "";
                this.remarkName_ = "";
                this.showAvatarInfoList_ = Collections.emptyList();
                this.friendEnterHomeOption_ = 0;
                this.platformType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.nickname_ = "";
                this.signature_ = "";
                this.onlineState_ = 0;
                this.onlineId_ = "";
                this.remarkName_ = "";
                this.showAvatarInfoList_ = Collections.emptyList();
                this.friendEnterHomeOption_ = 0;
                this.platformType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FriendBrief.alwaysUseFieldBuilders) {
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
                this.worldLevel_ = 0;
                this.signature_ = "";
                this.onlineState_ = 0;
                this.param_ = 0;
                this.isMpModeAvailable_ = false;
                this.onlineId_ = "";
                this.lastActiveTime_ = 0;
                this.nameCardId_ = 0;
                this.mpPlayerNum_ = 0;
                this.isChatNoDisturb_ = false;
                this.chatSequence_ = 0;
                this.remarkName_ = "";
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.showAvatarInfoListBuilder_.clear();
                }
                this.friendEnterHomeOption_ = 0;
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                this.isGameSource_ = false;
                this.isPsnSource_ = false;
                this.platformType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FriendBriefOuterClass.internal_static_FriendBrief_descriptor;
            }
            
            @Override
            public FriendBrief getDefaultInstanceForType() {
                return FriendBrief.getDefaultInstance();
            }
            
            @Override
            public FriendBrief build() {
                final FriendBrief result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FriendBrief buildPartial() {
                final FriendBrief result = new FriendBrief(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                result.nickname_ = this.nickname_;
                result.level_ = this.level_;
                result.avatarId_ = this.avatarId_;
                result.worldLevel_ = this.worldLevel_;
                result.signature_ = this.signature_;
                result.onlineState_ = this.onlineState_;
                result.param_ = this.param_;
                result.isMpModeAvailable_ = this.isMpModeAvailable_;
                result.onlineId_ = this.onlineId_;
                result.lastActiveTime_ = this.lastActiveTime_;
                result.nameCardId_ = this.nameCardId_;
                result.mpPlayerNum_ = this.mpPlayerNum_;
                result.isChatNoDisturb_ = this.isChatNoDisturb_;
                result.chatSequence_ = this.chatSequence_;
                result.remarkName_ = this.remarkName_;
                if (this.showAvatarInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>)this.showAvatarInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.showAvatarInfoList_ = this.showAvatarInfoList_;
                }
                else {
                    result.showAvatarInfoList_ = this.showAvatarInfoListBuilder_.build();
                }
                result.friendEnterHomeOption_ = this.friendEnterHomeOption_;
                if (this.profilePictureBuilder_ == null) {
                    result.profilePicture_ = this.profilePicture_;
                }
                else {
                    result.profilePicture_ = this.profilePictureBuilder_.build();
                }
                result.isGameSource_ = this.isGameSource_;
                result.isPsnSource_ = this.isPsnSource_;
                result.platformType_ = this.platformType_;
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
                if (other instanceof FriendBrief) {
                    return this.mergeFrom((FriendBrief)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FriendBrief other) {
                if (other == FriendBrief.getDefaultInstance()) {
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
                if (other.getWorldLevel() != 0) {
                    this.setWorldLevel(other.getWorldLevel());
                }
                if (!other.getSignature().isEmpty()) {
                    this.signature_ = other.signature_;
                    this.onChanged();
                }
                if (other.onlineState_ != 0) {
                    this.setOnlineStateValue(other.getOnlineStateValue());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (other.getIsMpModeAvailable()) {
                    this.setIsMpModeAvailable(other.getIsMpModeAvailable());
                }
                if (!other.getOnlineId().isEmpty()) {
                    this.onlineId_ = other.onlineId_;
                    this.onChanged();
                }
                if (other.getLastActiveTime() != 0) {
                    this.setLastActiveTime(other.getLastActiveTime());
                }
                if (other.getNameCardId() != 0) {
                    this.setNameCardId(other.getNameCardId());
                }
                if (other.getMpPlayerNum() != 0) {
                    this.setMpPlayerNum(other.getMpPlayerNum());
                }
                if (other.getIsChatNoDisturb()) {
                    this.setIsChatNoDisturb(other.getIsChatNoDisturb());
                }
                if (other.getChatSequence() != 0) {
                    this.setChatSequence(other.getChatSequence());
                }
                if (!other.getRemarkName().isEmpty()) {
                    this.remarkName_ = other.remarkName_;
                    this.onChanged();
                }
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (!other.showAvatarInfoList_.isEmpty()) {
                        if (this.showAvatarInfoList_.isEmpty()) {
                            this.showAvatarInfoList_ = other.showAvatarInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
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
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.showAvatarInfoListBuilder_ = (FriendBrief.alwaysUseFieldBuilders ? this.getShowAvatarInfoListFieldBuilder() : null);
                    }
                    else {
                        this.showAvatarInfoListBuilder_.addAllMessages(other.showAvatarInfoList_);
                    }
                }
                if (other.friendEnterHomeOption_ != 0) {
                    this.setFriendEnterHomeOptionValue(other.getFriendEnterHomeOptionValue());
                }
                if (other.hasProfilePicture()) {
                    this.mergeProfilePicture(other.getProfilePicture());
                }
                if (other.getIsGameSource()) {
                    this.setIsGameSource(other.getIsGameSource());
                }
                if (other.getIsPsnSource()) {
                    this.setIsPsnSource(other.getIsPsnSource());
                }
                if (other.platformType_ != 0) {
                    this.setPlatformTypeValue(other.getPlatformTypeValue());
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
                FriendBrief parsedMessage = null;
                try {
                    parsedMessage = FriendBrief.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FriendBrief)e.getUnfinishedMessage();
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
                this.nickname_ = FriendBrief.getDefaultInstance().getNickname();
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
                this.signature_ = FriendBrief.getDefaultInstance().getSignature();
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
                this.onlineId_ = FriendBrief.getDefaultInstance().getOnlineId();
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
            public int getLastActiveTime() {
                return this.lastActiveTime_;
            }
            
            public Builder setLastActiveTime(final int value) {
                this.lastActiveTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLastActiveTime() {
                this.lastActiveTime_ = 0;
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
            public int getMpPlayerNum() {
                return this.mpPlayerNum_;
            }
            
            public Builder setMpPlayerNum(final int value) {
                this.mpPlayerNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMpPlayerNum() {
                this.mpPlayerNum_ = 0;
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
            public int getChatSequence() {
                return this.chatSequence_;
            }
            
            public Builder setChatSequence(final int value) {
                this.chatSequence_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChatSequence() {
                this.chatSequence_ = 0;
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
                this.remarkName_ = FriendBrief.getDefaultInstance().getRemarkName();
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
            
            private void ensureShowAvatarInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.showAvatarInfoList_ = new ArrayList<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo>(this.showAvatarInfoList_);
                    this.bitField0_ |= 0x1;
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
                    this.bitField0_ &= 0xFFFFFFFE;
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
                    this.showAvatarInfoListBuilder_ = new RepeatedFieldBuilderV3<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo.Builder, SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder>(this.showAvatarInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.showAvatarInfoList_ = null;
                }
                return this.showAvatarInfoListBuilder_;
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
            public boolean getIsGameSource() {
                return this.isGameSource_;
            }
            
            public Builder setIsGameSource(final boolean value) {
                this.isGameSource_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsGameSource() {
                this.isGameSource_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsPsnSource() {
                return this.isPsnSource_;
            }
            
            public Builder setIsPsnSource(final boolean value) {
                this.isPsnSource_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsPsnSource() {
                this.isPsnSource_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPlatformTypeValue() {
                return this.platformType_;
            }
            
            public Builder setPlatformTypeValue(final int value) {
                this.platformType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public PlatformTypeOuterClass.PlatformType getPlatformType() {
                final PlatformTypeOuterClass.PlatformType result = PlatformTypeOuterClass.PlatformType.valueOf(this.platformType_);
                return (result == null) ? PlatformTypeOuterClass.PlatformType.UNRECOGNIZED : result;
            }
            
            public Builder setPlatformType(final PlatformTypeOuterClass.PlatformType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.platformType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearPlatformType() {
                this.platformType_ = 0;
                this.onChanged();
                return this;
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
    
    public interface FriendBriefOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        String getNickname();
        
        ByteString getNicknameBytes();
        
        int getLevel();
        
        int getAvatarId();
        
        int getWorldLevel();
        
        String getSignature();
        
        ByteString getSignatureBytes();
        
        int getOnlineStateValue();
        
        FriendOnlineStateOuterClass.FriendOnlineState getOnlineState();
        
        int getParam();
        
        boolean getIsMpModeAvailable();
        
        String getOnlineId();
        
        ByteString getOnlineIdBytes();
        
        int getLastActiveTime();
        
        int getNameCardId();
        
        int getMpPlayerNum();
        
        boolean getIsChatNoDisturb();
        
        int getChatSequence();
        
        String getRemarkName();
        
        ByteString getRemarkNameBytes();
        
        List<SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo> getShowAvatarInfoListList();
        
        SocialShowAvatarInfoOuterClass.SocialShowAvatarInfo getShowAvatarInfoList(final int p0);
        
        int getShowAvatarInfoListCount();
        
        List<? extends SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList();
        
        SocialShowAvatarInfoOuterClass.SocialShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int p0);
        
        int getFriendEnterHomeOptionValue();
        
        FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getFriendEnterHomeOption();
        
        boolean hasProfilePicture();
        
        ProfilePictureOuterClass.ProfilePicture getProfilePicture();
        
        ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();
        
        boolean getIsGameSource();
        
        boolean getIsPsnSource();
        
        int getPlatformTypeValue();
        
        PlatformTypeOuterClass.PlatformType getPlatformType();
    }
}
