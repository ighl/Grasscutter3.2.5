// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class OnlinePlayerInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_OnlinePlayerInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_OnlinePlayerInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private OnlinePlayerInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OnlinePlayerInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016OnlinePlayerInfo.proto\u001a\u0013MpSettingType.proto\u001a\u0014ProfilePicture.proto\"\u00cb\u0002\n\u0010OnlinePlayerInfo\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\r\u0012\u0010\n\bnickname\u0018\u0002 \u0001(\t\u0012\u0014\n\fplayer_level\u0018\u0003 \u0001(\r\u0012\u0011\n\tavatar_id\u0018\u0004 \u0001(\r\u0012'\n\u000fmp_setting_type\u0018\u0005 \u0001(\u000e2\u000e.MpSettingType\u0012\u001f\n\u0017cur_player_num_in_world\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bworld_level\u0018\u0007 \u0001(\r\u0012\u0011\n\tonline_id\u0018\b \u0001(\t\u0012\u0014\n\fname_card_id\u0018\t \u0001(\r\u0012\u001a\n\u0012blacklist_uid_list\u0018\n \u0003(\r\u0012\u0011\n\tsignature\u0018\u000b \u0001(\t\u0012(\n\u000fprofile_picture\u0018\f \u0001(\u000b2\u000f.ProfilePicture\u0012\u000e\n\u0006psn_id\u0018\r \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OnlinePlayerInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MpSettingTypeOuterClass.getDescriptor(), ProfilePictureOuterClass.getDescriptor() });
        internal_static_OnlinePlayerInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OnlinePlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_descriptor, new String[] { "Uid", "Nickname", "PlayerLevel", "AvatarId", "MpSettingType", "CurPlayerNumInWorld", "WorldLevel", "OnlineId", "NameCardId", "BlacklistUidList", "Signature", "ProfilePicture", "PsnId" });
        MpSettingTypeOuterClass.getDescriptor();
        ProfilePictureOuterClass.getDescriptor();
    }
    
    public static final class OnlinePlayerInfo extends GeneratedMessageV3 implements OnlinePlayerInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 1;
        private int uid_;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        private volatile Object nickname_;
        public static final int PLAYER_LEVEL_FIELD_NUMBER = 3;
        private int playerLevel_;
        public static final int AVATAR_ID_FIELD_NUMBER = 4;
        private int avatarId_;
        public static final int MP_SETTING_TYPE_FIELD_NUMBER = 5;
        private int mpSettingType_;
        public static final int CUR_PLAYER_NUM_IN_WORLD_FIELD_NUMBER = 6;
        private int curPlayerNumInWorld_;
        public static final int WORLD_LEVEL_FIELD_NUMBER = 7;
        private int worldLevel_;
        public static final int ONLINE_ID_FIELD_NUMBER = 8;
        private volatile Object onlineId_;
        public static final int NAME_CARD_ID_FIELD_NUMBER = 9;
        private int nameCardId_;
        public static final int BLACKLIST_UID_LIST_FIELD_NUMBER = 10;
        private Internal.IntList blacklistUidList_;
        private int blacklistUidListMemoizedSerializedSize;
        public static final int SIGNATURE_FIELD_NUMBER = 11;
        private volatile Object signature_;
        public static final int PROFILE_PICTURE_FIELD_NUMBER = 12;
        private ProfilePictureOuterClass.ProfilePicture profilePicture_;
        public static final int PSN_ID_FIELD_NUMBER = 13;
        private volatile Object psnId_;
        private byte memoizedIsInitialized;
        private static final OnlinePlayerInfo DEFAULT_INSTANCE;
        private static final Parser<OnlinePlayerInfo> PARSER;
        
        private OnlinePlayerInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.blacklistUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private OnlinePlayerInfo() {
            this.blacklistUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.nickname_ = "";
            this.mpSettingType_ = 0;
            this.onlineId_ = "";
            this.blacklistUidList_ = GeneratedMessageV3.emptyIntList();
            this.signature_ = "";
            this.psnId_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new OnlinePlayerInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private OnlinePlayerInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.playerLevel_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            final int rawValue = input.readEnum();
                            this.mpSettingType_ = rawValue;
                            continue;
                        }
                        case 48: {
                            this.curPlayerNumInWorld_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.worldLevel_ = input.readUInt32();
                            continue;
                        }
                        case 66: {
                            final String s = input.readStringRequireUtf8();
                            this.onlineId_ = s;
                            continue;
                        }
                        case 72: {
                            this.nameCardId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.blacklistUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.blacklistUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.blacklistUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.blacklistUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 90: {
                            final String s = input.readStringRequireUtf8();
                            this.signature_ = s;
                            continue;
                        }
                        case 98: {
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
                        case 106: {
                            final String s = input.readStringRequireUtf8();
                            this.psnId_ = s;
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
                    this.blacklistUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OnlinePlayerInfo.class, Builder.class);
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
        public int getPlayerLevel() {
            return this.playerLevel_;
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public int getMpSettingTypeValue() {
            return this.mpSettingType_;
        }
        
        @Override
        public MpSettingTypeOuterClass.MpSettingType getMpSettingType() {
            final MpSettingTypeOuterClass.MpSettingType result = MpSettingTypeOuterClass.MpSettingType.valueOf(this.mpSettingType_);
            return (result == null) ? MpSettingTypeOuterClass.MpSettingType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getCurPlayerNumInWorld() {
            return this.curPlayerNumInWorld_;
        }
        
        @Override
        public int getWorldLevel() {
            return this.worldLevel_;
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
        public List<Integer> getBlacklistUidListList() {
            return this.blacklistUidList_;
        }
        
        @Override
        public int getBlacklistUidListCount() {
            return this.blacklistUidList_.size();
        }
        
        @Override
        public int getBlacklistUidList(final int index) {
            return this.blacklistUidList_.getInt(index);
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
        public String getPsnId() {
            final Object ref = this.psnId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.psnId_ = s);
        }
        
        @Override
        public ByteString getPsnIdBytes() {
            final Object ref = this.psnId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.psnId_ = b);
            }
            return (ByteString)ref;
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
            if (this.playerLevel_ != 0) {
                output.writeUInt32(3, this.playerLevel_);
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(4, this.avatarId_);
            }
            if (this.mpSettingType_ != MpSettingTypeOuterClass.MpSettingType.MP_SETTING_TYPE_NO_ENTER.getNumber()) {
                output.writeEnum(5, this.mpSettingType_);
            }
            if (this.curPlayerNumInWorld_ != 0) {
                output.writeUInt32(6, this.curPlayerNumInWorld_);
            }
            if (this.worldLevel_ != 0) {
                output.writeUInt32(7, this.worldLevel_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                GeneratedMessageV3.writeString(output, 8, this.onlineId_);
            }
            if (this.nameCardId_ != 0) {
                output.writeUInt32(9, this.nameCardId_);
            }
            if (this.getBlacklistUidListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.blacklistUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.blacklistUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.blacklistUidList_.getInt(i));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                GeneratedMessageV3.writeString(output, 11, this.signature_);
            }
            if (this.profilePicture_ != null) {
                output.writeMessage(12, this.getProfilePicture());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                GeneratedMessageV3.writeString(output, 13, this.psnId_);
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
            if (this.playerLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.playerLevel_);
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.avatarId_);
            }
            if (this.mpSettingType_ != MpSettingTypeOuterClass.MpSettingType.MP_SETTING_TYPE_NO_ENTER.getNumber()) {
                size += CodedOutputStream.computeEnumSize(5, this.mpSettingType_);
            }
            if (this.curPlayerNumInWorld_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.curPlayerNumInWorld_);
            }
            if (this.worldLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.worldLevel_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.onlineId_)) {
                size += GeneratedMessageV3.computeStringSize(8, this.onlineId_);
            }
            if (this.nameCardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.nameCardId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.blacklistUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.blacklistUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getBlacklistUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.blacklistUidListMemoizedSerializedSize = dataSize;
            if (!GeneratedMessageV3.isStringEmpty(this.signature_)) {
                size += GeneratedMessageV3.computeStringSize(11, this.signature_);
            }
            if (this.profilePicture_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getProfilePicture());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                size += GeneratedMessageV3.computeStringSize(13, this.psnId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnlinePlayerInfo)) {
                return super.equals(obj);
            }
            final OnlinePlayerInfo other = (OnlinePlayerInfo)obj;
            return this.getUid() == other.getUid() && this.getNickname().equals(other.getNickname()) && this.getPlayerLevel() == other.getPlayerLevel() && this.getAvatarId() == other.getAvatarId() && this.mpSettingType_ == other.mpSettingType_ && this.getCurPlayerNumInWorld() == other.getCurPlayerNumInWorld() && this.getWorldLevel() == other.getWorldLevel() && this.getOnlineId().equals(other.getOnlineId()) && this.getNameCardId() == other.getNameCardId() && this.getBlacklistUidListList().equals(other.getBlacklistUidListList()) && this.getSignature().equals(other.getSignature()) && this.hasProfilePicture() == other.hasProfilePicture() && (!this.hasProfilePicture() || this.getProfilePicture().equals(other.getProfilePicture())) && this.getPsnId().equals(other.getPsnId()) && this.unknownFields.equals(other.unknownFields);
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
            hash = 53 * hash + this.getPlayerLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.mpSettingType_;
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getCurPlayerNumInWorld();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getWorldLevel();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getOnlineId().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getNameCardId();
            if (this.getBlacklistUidListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getBlacklistUidListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getSignature().hashCode();
            if (this.hasProfilePicture()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getProfilePicture().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getPsnId().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static OnlinePlayerInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static OnlinePlayerInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OnlinePlayerInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static OnlinePlayerInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OnlinePlayerInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data);
        }
        
        public static OnlinePlayerInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OnlinePlayerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OnlinePlayerInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OnlinePlayerInfo.PARSER, input);
        }
        
        public static OnlinePlayerInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OnlinePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        public static OnlinePlayerInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OnlinePlayerInfo.PARSER, input);
        }
        
        public static OnlinePlayerInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OnlinePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        public static OnlinePlayerInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OnlinePlayerInfo.PARSER, input);
        }
        
        public static OnlinePlayerInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OnlinePlayerInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return OnlinePlayerInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final OnlinePlayerInfo prototype) {
            return OnlinePlayerInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == OnlinePlayerInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static OnlinePlayerInfo getDefaultInstance() {
            return OnlinePlayerInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<OnlinePlayerInfo> parser() {
            return OnlinePlayerInfo.PARSER;
        }
        
        @Override
        public Parser<OnlinePlayerInfo> getParserForType() {
            return OnlinePlayerInfo.PARSER;
        }
        
        @Override
        public OnlinePlayerInfo getDefaultInstanceForType() {
            return OnlinePlayerInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new OnlinePlayerInfo();
            PARSER = new AbstractParser<OnlinePlayerInfo>() {
                @Override
                public OnlinePlayerInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new OnlinePlayerInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OnlinePlayerInfoOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private Object nickname_;
            private int playerLevel_;
            private int avatarId_;
            private int mpSettingType_;
            private int curPlayerNumInWorld_;
            private int worldLevel_;
            private Object onlineId_;
            private int nameCardId_;
            private Internal.IntList blacklistUidList_;
            private Object signature_;
            private ProfilePictureOuterClass.ProfilePicture profilePicture_;
            private SingleFieldBuilderV3<ProfilePictureOuterClass.ProfilePicture, ProfilePictureOuterClass.ProfilePicture.Builder, ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
            private Object psnId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OnlinePlayerInfo.class, Builder.class);
            }
            
            private Builder() {
                this.nickname_ = "";
                this.mpSettingType_ = 0;
                this.onlineId_ = "";
                this.blacklistUidList_ = GeneratedMessageV3.emptyIntList();
                this.signature_ = "";
                this.psnId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.nickname_ = "";
                this.mpSettingType_ = 0;
                this.onlineId_ = "";
                this.blacklistUidList_ = GeneratedMessageV3.emptyIntList();
                this.signature_ = "";
                this.psnId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (OnlinePlayerInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                this.nickname_ = "";
                this.playerLevel_ = 0;
                this.avatarId_ = 0;
                this.mpSettingType_ = 0;
                this.curPlayerNumInWorld_ = 0;
                this.worldLevel_ = 0;
                this.onlineId_ = "";
                this.nameCardId_ = 0;
                this.blacklistUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.signature_ = "";
                if (this.profilePictureBuilder_ == null) {
                    this.profilePicture_ = null;
                }
                else {
                    this.profilePicture_ = null;
                    this.profilePictureBuilder_ = null;
                }
                this.psnId_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return OnlinePlayerInfoOuterClass.internal_static_OnlinePlayerInfo_descriptor;
            }
            
            @Override
            public OnlinePlayerInfo getDefaultInstanceForType() {
                return OnlinePlayerInfo.getDefaultInstance();
            }
            
            @Override
            public OnlinePlayerInfo build() {
                final OnlinePlayerInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public OnlinePlayerInfo buildPartial() {
                final OnlinePlayerInfo result = new OnlinePlayerInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                result.nickname_ = this.nickname_;
                result.playerLevel_ = this.playerLevel_;
                result.avatarId_ = this.avatarId_;
                result.mpSettingType_ = this.mpSettingType_;
                result.curPlayerNumInWorld_ = this.curPlayerNumInWorld_;
                result.worldLevel_ = this.worldLevel_;
                result.onlineId_ = this.onlineId_;
                result.nameCardId_ = this.nameCardId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.blacklistUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.blacklistUidList_ = this.blacklistUidList_;
                result.signature_ = this.signature_;
                if (this.profilePictureBuilder_ == null) {
                    result.profilePicture_ = this.profilePicture_;
                }
                else {
                    result.profilePicture_ = this.profilePictureBuilder_.build();
                }
                result.psnId_ = this.psnId_;
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
                if (other instanceof OnlinePlayerInfo) {
                    return this.mergeFrom((OnlinePlayerInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final OnlinePlayerInfo other) {
                if (other == OnlinePlayerInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (!other.getNickname().isEmpty()) {
                    this.nickname_ = other.nickname_;
                    this.onChanged();
                }
                if (other.getPlayerLevel() != 0) {
                    this.setPlayerLevel(other.getPlayerLevel());
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.mpSettingType_ != 0) {
                    this.setMpSettingTypeValue(other.getMpSettingTypeValue());
                }
                if (other.getCurPlayerNumInWorld() != 0) {
                    this.setCurPlayerNumInWorld(other.getCurPlayerNumInWorld());
                }
                if (other.getWorldLevel() != 0) {
                    this.setWorldLevel(other.getWorldLevel());
                }
                if (!other.getOnlineId().isEmpty()) {
                    this.onlineId_ = other.onlineId_;
                    this.onChanged();
                }
                if (other.getNameCardId() != 0) {
                    this.setNameCardId(other.getNameCardId());
                }
                if (!other.blacklistUidList_.isEmpty()) {
                    if (this.blacklistUidList_.isEmpty()) {
                        this.blacklistUidList_ = other.blacklistUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureBlacklistUidListIsMutable();
                        this.blacklistUidList_.addAll(other.blacklistUidList_);
                    }
                    this.onChanged();
                }
                if (!other.getSignature().isEmpty()) {
                    this.signature_ = other.signature_;
                    this.onChanged();
                }
                if (other.hasProfilePicture()) {
                    this.mergeProfilePicture(other.getProfilePicture());
                }
                if (!other.getPsnId().isEmpty()) {
                    this.psnId_ = other.psnId_;
                    this.onChanged();
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
                OnlinePlayerInfo parsedMessage = null;
                try {
                    parsedMessage = OnlinePlayerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (OnlinePlayerInfo)e.getUnfinishedMessage();
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
                this.nickname_ = OnlinePlayerInfo.getDefaultInstance().getNickname();
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
            public int getPlayerLevel() {
                return this.playerLevel_;
            }
            
            public Builder setPlayerLevel(final int value) {
                this.playerLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlayerLevel() {
                this.playerLevel_ = 0;
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
            public int getMpSettingTypeValue() {
                return this.mpSettingType_;
            }
            
            public Builder setMpSettingTypeValue(final int value) {
                this.mpSettingType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MpSettingTypeOuterClass.MpSettingType getMpSettingType() {
                final MpSettingTypeOuterClass.MpSettingType result = MpSettingTypeOuterClass.MpSettingType.valueOf(this.mpSettingType_);
                return (result == null) ? MpSettingTypeOuterClass.MpSettingType.UNRECOGNIZED : result;
            }
            
            public Builder setMpSettingType(final MpSettingTypeOuterClass.MpSettingType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.mpSettingType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearMpSettingType() {
                this.mpSettingType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurPlayerNumInWorld() {
                return this.curPlayerNumInWorld_;
            }
            
            public Builder setCurPlayerNumInWorld(final int value) {
                this.curPlayerNumInWorld_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurPlayerNumInWorld() {
                this.curPlayerNumInWorld_ = 0;
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
                this.onlineId_ = OnlinePlayerInfo.getDefaultInstance().getOnlineId();
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
            
            private void ensureBlacklistUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.blacklistUidList_ = GeneratedMessageV3.mutableCopy(this.blacklistUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getBlacklistUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.blacklistUidList_) : this.blacklistUidList_;
            }
            
            @Override
            public int getBlacklistUidListCount() {
                return this.blacklistUidList_.size();
            }
            
            @Override
            public int getBlacklistUidList(final int index) {
                return this.blacklistUidList_.getInt(index);
            }
            
            public Builder setBlacklistUidList(final int index, final int value) {
                this.ensureBlacklistUidListIsMutable();
                this.blacklistUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addBlacklistUidList(final int value) {
                this.ensureBlacklistUidListIsMutable();
                this.blacklistUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllBlacklistUidList(final Iterable<? extends Integer> values) {
                this.ensureBlacklistUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.blacklistUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearBlacklistUidList() {
                this.blacklistUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
                this.signature_ = OnlinePlayerInfo.getDefaultInstance().getSignature();
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
            public String getPsnId() {
                final Object ref = this.psnId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.psnId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPsnIdBytes() {
                final Object ref = this.psnId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.psnId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPsnId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.psnId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPsnId() {
                this.psnId_ = OnlinePlayerInfo.getDefaultInstance().getPsnId();
                this.onChanged();
                return this;
            }
            
            public Builder setPsnIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.psnId_ = value;
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
    
    public interface OnlinePlayerInfoOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        String getNickname();
        
        ByteString getNicknameBytes();
        
        int getPlayerLevel();
        
        int getAvatarId();
        
        int getMpSettingTypeValue();
        
        MpSettingTypeOuterClass.MpSettingType getMpSettingType();
        
        int getCurPlayerNumInWorld();
        
        int getWorldLevel();
        
        String getOnlineId();
        
        ByteString getOnlineIdBytes();
        
        int getNameCardId();
        
        List<Integer> getBlacklistUidListList();
        
        int getBlacklistUidListCount();
        
        int getBlacklistUidList(final int p0);
        
        String getSignature();
        
        ByteString getSignatureBytes();
        
        boolean hasProfilePicture();
        
        ProfilePictureOuterClass.ProfilePicture getProfilePicture();
        
        ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();
        
        String getPsnId();
        
        ByteString getPsnIdBytes();
    }
}
