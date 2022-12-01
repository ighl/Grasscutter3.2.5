// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetPlayerTokenRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetPlayerTokenRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetPlayerTokenRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetPlayerTokenRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetPlayerTokenRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017GetPlayerTokenRsp.proto\"\u00d6\u0005\n\u0011GetPlayerTokenRsp\u0012\u0011\n\bbirthday\u0018\u0081\u0003 \u0001(\t\u0012\u0010\n\u0007retcode\u0018\u00fe\u000b \u0001(\u0005\u0012\u001b\n\u0013security_cmd_buffer\u0018\u0001 \u0001(\f\u0012\u0017\n\u000fsecret_key_seed\u0018\t \u0001(\u0004\u0012\u0015\n\fcountry_code\u0018²\u000e \u0001(\t\u0012\u0017\n\u000eextra_bin_data\u0018\u00c4\u0002 \u0001(\f\u0012\u0012\n\nsecret_key\u0018\u0007 \u0001(\t\u0012\u001c\n\u0013Unk2700_NOJPEHIBDJH\u0018\u0099\f \u0001(\r\u0012\u001a\n\u0012black_uid_end_time\u0018\u000e \u0001(\r\u0012\f\n\u0003tag\u0018\u00e3\f \u0001(\r\u0012\r\n\u0005token\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006gm_uid\u0018\u0006 \u0001(\r\u0012\u0013\n\nchannel_id\u0018\u0080\u0007 \u0001(\r\u0012\u000f\n\u0006psn_id\u0018\u0093\u000e \u0001(\t\u0012\u0016\n\rclient_ip_str\u0018\u00dc\u0006 \u0001(\t\u0012\f\n\u0003msg\u0018\u00ca\u0006 \u0001(\t\u0012\u0015\n\faccount_type\u0018\u009e\u0006 \u0001(\r\u0012\u0017\n\u000esub_channel_id\u0018\u008a\u000e \u0001(\r\u0012\u001c\n\u0013Unk2700_FLBKPCPGPDH\u0018\u00ec\u000f \u0001(\b\u0012\u0017\n\u000eencrypted_seed\u0018\u009f\u0003 \u0001(\t\u0012\u001c\n\u0014is_proficient_player\u0018\u0002 \u0001(\b\u0012\u000f\n\u0006key_id\u0018\u00ad\u0006 \u0001(\r\u0012\u000b\n\u0003uid\u0018\n \u0001(\r\u0012\u0013\n\u000baccount_uid\u00180 \u0001(\t\u0012\u0010\n\bis_guest\u0018\u000b \u0001(\b\u0012\"\n\u0019client_version_random_key\u0018\u00f9\u000b \u0001(\t\u0012\u001c\n\u0013Unk2800_NNBFCEAOEPB\u0018\u00e8\f \u0003(\r\u0012\u0015\n\rplatform_type\u0018\b \u0001(\r\u0012\u0015\n\freg_platform\u0018\u00d8\b \u0001(\r\u0012\u001c\n\u0013is_login_white_list\u0018½\u0004 \u0001(\b\u0012\u0017\n\u000eseed_signature\u0018¼\b \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetPlayerTokenRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetPlayerTokenRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetPlayerTokenRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_descriptor, new String[] { "Birthday", "Retcode", "SecurityCmdBuffer", "SecretKeySeed", "CountryCode", "ExtraBinData", "SecretKey", "Unk2700NOJPEHIBDJH", "BlackUidEndTime", "Tag", "Token", "GmUid", "ChannelId", "PsnId", "ClientIpStr", "Msg", "AccountType", "SubChannelId", "Unk2700FLBKPCPGPDH", "EncryptedSeed", "IsProficientPlayer", "KeyId", "Uid", "AccountUid", "IsGuest", "ClientVersionRandomKey", "Unk2800NNBFCEAOEPB", "PlatformType", "RegPlatform", "IsLoginWhiteList", "SeedSignature" });
    }
    
    public static final class GetPlayerTokenRsp extends GeneratedMessageV3 implements GetPlayerTokenRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BIRTHDAY_FIELD_NUMBER = 385;
        private volatile Object birthday_;
        public static final int RETCODE_FIELD_NUMBER = 1534;
        private int retcode_;
        public static final int SECURITY_CMD_BUFFER_FIELD_NUMBER = 1;
        private ByteString securityCmdBuffer_;
        public static final int SECRET_KEY_SEED_FIELD_NUMBER = 9;
        private long secretKeySeed_;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 1842;
        private volatile Object countryCode_;
        public static final int EXTRA_BIN_DATA_FIELD_NUMBER = 324;
        private ByteString extraBinData_;
        public static final int SECRET_KEY_FIELD_NUMBER = 7;
        private volatile Object secretKey_;
        public static final int UNK2700_NOJPEHIBDJH_FIELD_NUMBER = 1561;
        private int unk2700NOJPEHIBDJH_;
        public static final int BLACK_UID_END_TIME_FIELD_NUMBER = 14;
        private int blackUidEndTime_;
        public static final int TAG_FIELD_NUMBER = 1635;
        private int tag_;
        public static final int TOKEN_FIELD_NUMBER = 3;
        private volatile Object token_;
        public static final int GM_UID_FIELD_NUMBER = 6;
        private int gmUid_;
        public static final int CHANNEL_ID_FIELD_NUMBER = 896;
        private int channelId_;
        public static final int PSN_ID_FIELD_NUMBER = 1811;
        private volatile Object psnId_;
        public static final int CLIENT_IP_STR_FIELD_NUMBER = 860;
        private volatile Object clientIpStr_;
        public static final int MSG_FIELD_NUMBER = 842;
        private volatile Object msg_;
        public static final int ACCOUNT_TYPE_FIELD_NUMBER = 798;
        private int accountType_;
        public static final int SUB_CHANNEL_ID_FIELD_NUMBER = 1802;
        private int subChannelId_;
        public static final int UNK2700_FLBKPCPGPDH_FIELD_NUMBER = 2028;
        private boolean unk2700FLBKPCPGPDH_;
        public static final int ENCRYPTED_SEED_FIELD_NUMBER = 415;
        private volatile Object encryptedSeed_;
        public static final int IS_PROFICIENT_PLAYER_FIELD_NUMBER = 2;
        private boolean isProficientPlayer_;
        public static final int KEY_ID_FIELD_NUMBER = 813;
        private int keyId_;
        public static final int UID_FIELD_NUMBER = 10;
        private int uid_;
        public static final int ACCOUNT_UID_FIELD_NUMBER = 48;
        private volatile Object accountUid_;
        public static final int IS_GUEST_FIELD_NUMBER = 11;
        private boolean isGuest_;
        public static final int CLIENT_VERSION_RANDOM_KEY_FIELD_NUMBER = 1529;
        private volatile Object clientVersionRandomKey_;
        public static final int UNK2800_NNBFCEAOEPB_FIELD_NUMBER = 1640;
        private Internal.IntList unk2800NNBFCEAOEPB_;
        private int unk2800NNBFCEAOEPBMemoizedSerializedSize;
        public static final int PLATFORM_TYPE_FIELD_NUMBER = 8;
        private int platformType_;
        public static final int REG_PLATFORM_FIELD_NUMBER = 1112;
        private int regPlatform_;
        public static final int IS_LOGIN_WHITE_LIST_FIELD_NUMBER = 573;
        private boolean isLoginWhiteList_;
        public static final int SEED_SIGNATURE_FIELD_NUMBER = 1084;
        private volatile Object seedSignature_;
        private byte memoizedIsInitialized;
        private static final GetPlayerTokenRsp DEFAULT_INSTANCE;
        private static final Parser<GetPlayerTokenRsp> PARSER;
        
        private GetPlayerTokenRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unk2800NNBFCEAOEPBMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetPlayerTokenRsp() {
            this.unk2800NNBFCEAOEPBMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.birthday_ = "";
            this.securityCmdBuffer_ = ByteString.EMPTY;
            this.countryCode_ = "";
            this.extraBinData_ = ByteString.EMPTY;
            this.secretKey_ = "";
            this.token_ = "";
            this.psnId_ = "";
            this.clientIpStr_ = "";
            this.msg_ = "";
            this.encryptedSeed_ = "";
            this.accountUid_ = "";
            this.clientVersionRandomKey_ = "";
            this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.emptyIntList();
            this.seedSignature_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetPlayerTokenRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetPlayerTokenRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            this.securityCmdBuffer_ = input.readBytes();
                            continue;
                        }
                        case 16: {
                            this.isProficientPlayer_ = input.readBool();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.token_ = s;
                            continue;
                        }
                        case 48: {
                            this.gmUid_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            final String s = input.readStringRequireUtf8();
                            this.secretKey_ = s;
                            continue;
                        }
                        case 64: {
                            this.platformType_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.secretKeySeed_ = input.readUInt64();
                            continue;
                        }
                        case 80: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.isGuest_ = input.readBool();
                            continue;
                        }
                        case 112: {
                            this.blackUidEndTime_ = input.readUInt32();
                            continue;
                        }
                        case 386: {
                            final String s = input.readStringRequireUtf8();
                            this.accountUid_ = s;
                            continue;
                        }
                        case 2594: {
                            this.extraBinData_ = input.readBytes();
                            continue;
                        }
                        case 3082: {
                            final String s = input.readStringRequireUtf8();
                            this.birthday_ = s;
                            continue;
                        }
                        case 3322: {
                            final String s = input.readStringRequireUtf8();
                            this.encryptedSeed_ = s;
                            continue;
                        }
                        case 4584: {
                            this.isLoginWhiteList_ = input.readBool();
                            continue;
                        }
                        case 6384: {
                            this.accountType_ = input.readUInt32();
                            continue;
                        }
                        case 6504: {
                            this.keyId_ = input.readUInt32();
                            continue;
                        }
                        case 6738: {
                            final String s = input.readStringRequireUtf8();
                            this.msg_ = s;
                            continue;
                        }
                        case 6882: {
                            final String s = input.readStringRequireUtf8();
                            this.clientIpStr_ = s;
                            continue;
                        }
                        case 7168: {
                            this.channelId_ = input.readUInt32();
                            continue;
                        }
                        case 8674: {
                            final String s = input.readStringRequireUtf8();
                            this.seedSignature_ = s;
                            continue;
                        }
                        case 8896: {
                            this.regPlatform_ = input.readUInt32();
                            continue;
                        }
                        case 12234: {
                            final String s = input.readStringRequireUtf8();
                            this.clientVersionRandomKey_ = s;
                            continue;
                        }
                        case 12272: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 12488: {
                            this.unk2700NOJPEHIBDJH_ = input.readUInt32();
                            continue;
                        }
                        case 13080: {
                            this.tag_ = input.readUInt32();
                            continue;
                        }
                        case 13120: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2800NNBFCEAOEPB_.addInt(input.readUInt32());
                            continue;
                        }
                        case 13122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.unk2800NNBFCEAOEPB_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 14416: {
                            this.subChannelId_ = input.readUInt32();
                            continue;
                        }
                        case 14490: {
                            final String s = input.readStringRequireUtf8();
                            this.psnId_ = s;
                            continue;
                        }
                        case 14738: {
                            final String s = input.readStringRequireUtf8();
                            this.countryCode_ = s;
                            continue;
                        }
                        case 16224: {
                            this.unk2700FLBKPCPGPDH_ = input.readBool();
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
                    this.unk2800NNBFCEAOEPB_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerTokenRsp.class, Builder.class);
        }
        
        @Override
        public String getBirthday() {
            final Object ref = this.birthday_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.birthday_ = s);
        }
        
        @Override
        public ByteString getBirthdayBytes() {
            final Object ref = this.birthday_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.birthday_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public ByteString getSecurityCmdBuffer() {
            return this.securityCmdBuffer_;
        }
        
        @Override
        public long getSecretKeySeed() {
            return this.secretKeySeed_;
        }
        
        @Override
        public String getCountryCode() {
            final Object ref = this.countryCode_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.countryCode_ = s);
        }
        
        @Override
        public ByteString getCountryCodeBytes() {
            final Object ref = this.countryCode_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.countryCode_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public ByteString getExtraBinData() {
            return this.extraBinData_;
        }
        
        @Override
        public String getSecretKey() {
            final Object ref = this.secretKey_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.secretKey_ = s);
        }
        
        @Override
        public ByteString getSecretKeyBytes() {
            final Object ref = this.secretKey_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.secretKey_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getUnk2700NOJPEHIBDJH() {
            return this.unk2700NOJPEHIBDJH_;
        }
        
        @Override
        public int getBlackUidEndTime() {
            return this.blackUidEndTime_;
        }
        
        @Override
        public int getTag() {
            return this.tag_;
        }
        
        @Override
        public String getToken() {
            final Object ref = this.token_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.token_ = s);
        }
        
        @Override
        public ByteString getTokenBytes() {
            final Object ref = this.token_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.token_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getGmUid() {
            return this.gmUid_;
        }
        
        @Override
        public int getChannelId() {
            return this.channelId_;
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
        public String getClientIpStr() {
            final Object ref = this.clientIpStr_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientIpStr_ = s);
        }
        
        @Override
        public ByteString getClientIpStrBytes() {
            final Object ref = this.clientIpStr_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientIpStr_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getMsg() {
            final Object ref = this.msg_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.msg_ = s);
        }
        
        @Override
        public ByteString getMsgBytes() {
            final Object ref = this.msg_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.msg_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getAccountType() {
            return this.accountType_;
        }
        
        @Override
        public int getSubChannelId() {
            return this.subChannelId_;
        }
        
        @Override
        public boolean getUnk2700FLBKPCPGPDH() {
            return this.unk2700FLBKPCPGPDH_;
        }
        
        @Override
        public String getEncryptedSeed() {
            final Object ref = this.encryptedSeed_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.encryptedSeed_ = s);
        }
        
        @Override
        public ByteString getEncryptedSeedBytes() {
            final Object ref = this.encryptedSeed_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.encryptedSeed_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getIsProficientPlayer() {
            return this.isProficientPlayer_;
        }
        
        @Override
        public int getKeyId() {
            return this.keyId_;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public String getAccountUid() {
            final Object ref = this.accountUid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.accountUid_ = s);
        }
        
        @Override
        public ByteString getAccountUidBytes() {
            final Object ref = this.accountUid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.accountUid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getIsGuest() {
            return this.isGuest_;
        }
        
        @Override
        public String getClientVersionRandomKey() {
            final Object ref = this.clientVersionRandomKey_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientVersionRandomKey_ = s);
        }
        
        @Override
        public ByteString getClientVersionRandomKeyBytes() {
            final Object ref = this.clientVersionRandomKey_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientVersionRandomKey_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public List<Integer> getUnk2800NNBFCEAOEPBList() {
            return this.unk2800NNBFCEAOEPB_;
        }
        
        @Override
        public int getUnk2800NNBFCEAOEPBCount() {
            return this.unk2800NNBFCEAOEPB_.size();
        }
        
        @Override
        public int getUnk2800NNBFCEAOEPB(final int index) {
            return this.unk2800NNBFCEAOEPB_.getInt(index);
        }
        
        @Override
        public int getPlatformType() {
            return this.platformType_;
        }
        
        @Override
        public int getRegPlatform() {
            return this.regPlatform_;
        }
        
        @Override
        public boolean getIsLoginWhiteList() {
            return this.isLoginWhiteList_;
        }
        
        @Override
        public String getSeedSignature() {
            final Object ref = this.seedSignature_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.seedSignature_ = s);
        }
        
        @Override
        public ByteString getSeedSignatureBytes() {
            final Object ref = this.seedSignature_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.seedSignature_ = b);
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
            if (!this.securityCmdBuffer_.isEmpty()) {
                output.writeBytes(1, this.securityCmdBuffer_);
            }
            if (this.isProficientPlayer_) {
                output.writeBool(2, this.isProficientPlayer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.token_)) {
                GeneratedMessageV3.writeString(output, 3, this.token_);
            }
            if (this.gmUid_ != 0) {
                output.writeUInt32(6, this.gmUid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.secretKey_)) {
                GeneratedMessageV3.writeString(output, 7, this.secretKey_);
            }
            if (this.platformType_ != 0) {
                output.writeUInt32(8, this.platformType_);
            }
            if (this.secretKeySeed_ != 0L) {
                output.writeUInt64(9, this.secretKeySeed_);
            }
            if (this.uid_ != 0) {
                output.writeUInt32(10, this.uid_);
            }
            if (this.isGuest_) {
                output.writeBool(11, this.isGuest_);
            }
            if (this.blackUidEndTime_ != 0) {
                output.writeUInt32(14, this.blackUidEndTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountUid_)) {
                GeneratedMessageV3.writeString(output, 48, this.accountUid_);
            }
            if (!this.extraBinData_.isEmpty()) {
                output.writeBytes(324, this.extraBinData_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.birthday_)) {
                GeneratedMessageV3.writeString(output, 385, this.birthday_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.encryptedSeed_)) {
                GeneratedMessageV3.writeString(output, 415, this.encryptedSeed_);
            }
            if (this.isLoginWhiteList_) {
                output.writeBool(573, this.isLoginWhiteList_);
            }
            if (this.accountType_ != 0) {
                output.writeUInt32(798, this.accountType_);
            }
            if (this.keyId_ != 0) {
                output.writeUInt32(813, this.keyId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.msg_)) {
                GeneratedMessageV3.writeString(output, 842, this.msg_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientIpStr_)) {
                GeneratedMessageV3.writeString(output, 860, this.clientIpStr_);
            }
            if (this.channelId_ != 0) {
                output.writeUInt32(896, this.channelId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.seedSignature_)) {
                GeneratedMessageV3.writeString(output, 1084, this.seedSignature_);
            }
            if (this.regPlatform_ != 0) {
                output.writeUInt32(1112, this.regPlatform_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientVersionRandomKey_)) {
                GeneratedMessageV3.writeString(output, 1529, this.clientVersionRandomKey_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(1534, this.retcode_);
            }
            if (this.unk2700NOJPEHIBDJH_ != 0) {
                output.writeUInt32(1561, this.unk2700NOJPEHIBDJH_);
            }
            if (this.tag_ != 0) {
                output.writeUInt32(1635, this.tag_);
            }
            if (this.getUnk2800NNBFCEAOEPBList().size() > 0) {
                output.writeUInt32NoTag(13122);
                output.writeUInt32NoTag(this.unk2800NNBFCEAOEPBMemoizedSerializedSize);
            }
            for (int i = 0; i < this.unk2800NNBFCEAOEPB_.size(); ++i) {
                output.writeUInt32NoTag(this.unk2800NNBFCEAOEPB_.getInt(i));
            }
            if (this.subChannelId_ != 0) {
                output.writeUInt32(1802, this.subChannelId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                GeneratedMessageV3.writeString(output, 1811, this.psnId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
                GeneratedMessageV3.writeString(output, 1842, this.countryCode_);
            }
            if (this.unk2700FLBKPCPGPDH_) {
                output.writeBool(2028, this.unk2700FLBKPCPGPDH_);
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
            if (!this.securityCmdBuffer_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(1, this.securityCmdBuffer_);
            }
            if (this.isProficientPlayer_) {
                size += CodedOutputStream.computeBoolSize(2, this.isProficientPlayer_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.token_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.token_);
            }
            if (this.gmUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.gmUid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.secretKey_)) {
                size += GeneratedMessageV3.computeStringSize(7, this.secretKey_);
            }
            if (this.platformType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.platformType_);
            }
            if (this.secretKeySeed_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(9, this.secretKeySeed_);
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.uid_);
            }
            if (this.isGuest_) {
                size += CodedOutputStream.computeBoolSize(11, this.isGuest_);
            }
            if (this.blackUidEndTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.blackUidEndTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.accountUid_)) {
                size += GeneratedMessageV3.computeStringSize(48, this.accountUid_);
            }
            if (!this.extraBinData_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(324, this.extraBinData_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.birthday_)) {
                size += GeneratedMessageV3.computeStringSize(385, this.birthday_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.encryptedSeed_)) {
                size += GeneratedMessageV3.computeStringSize(415, this.encryptedSeed_);
            }
            if (this.isLoginWhiteList_) {
                size += CodedOutputStream.computeBoolSize(573, this.isLoginWhiteList_);
            }
            if (this.accountType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(798, this.accountType_);
            }
            if (this.keyId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(813, this.keyId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.msg_)) {
                size += GeneratedMessageV3.computeStringSize(842, this.msg_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientIpStr_)) {
                size += GeneratedMessageV3.computeStringSize(860, this.clientIpStr_);
            }
            if (this.channelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(896, this.channelId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.seedSignature_)) {
                size += GeneratedMessageV3.computeStringSize(1084, this.seedSignature_);
            }
            if (this.regPlatform_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1112, this.regPlatform_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientVersionRandomKey_)) {
                size += GeneratedMessageV3.computeStringSize(1529, this.clientVersionRandomKey_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1534, this.retcode_);
            }
            if (this.unk2700NOJPEHIBDJH_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1561, this.unk2700NOJPEHIBDJH_);
            }
            if (this.tag_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1635, this.tag_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.unk2800NNBFCEAOEPB_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.unk2800NNBFCEAOEPB_.getInt(i));
            }
            size += dataSize;
            if (!this.getUnk2800NNBFCEAOEPBList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.unk2800NNBFCEAOEPBMemoizedSerializedSize = dataSize;
            if (this.subChannelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1802, this.subChannelId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.psnId_)) {
                size += GeneratedMessageV3.computeStringSize(1811, this.psnId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
                size += GeneratedMessageV3.computeStringSize(1842, this.countryCode_);
            }
            if (this.unk2700FLBKPCPGPDH_) {
                size += CodedOutputStream.computeBoolSize(2028, this.unk2700FLBKPCPGPDH_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayerTokenRsp)) {
                return super.equals(obj);
            }
            final GetPlayerTokenRsp other = (GetPlayerTokenRsp)obj;
            return this.getBirthday().equals(other.getBirthday()) && this.getRetcode() == other.getRetcode() && this.getSecurityCmdBuffer().equals(other.getSecurityCmdBuffer()) && this.getSecretKeySeed() == other.getSecretKeySeed() && this.getCountryCode().equals(other.getCountryCode()) && this.getExtraBinData().equals(other.getExtraBinData()) && this.getSecretKey().equals(other.getSecretKey()) && this.getUnk2700NOJPEHIBDJH() == other.getUnk2700NOJPEHIBDJH() && this.getBlackUidEndTime() == other.getBlackUidEndTime() && this.getTag() == other.getTag() && this.getToken().equals(other.getToken()) && this.getGmUid() == other.getGmUid() && this.getChannelId() == other.getChannelId() && this.getPsnId().equals(other.getPsnId()) && this.getClientIpStr().equals(other.getClientIpStr()) && this.getMsg().equals(other.getMsg()) && this.getAccountType() == other.getAccountType() && this.getSubChannelId() == other.getSubChannelId() && this.getUnk2700FLBKPCPGPDH() == other.getUnk2700FLBKPCPGPDH() && this.getEncryptedSeed().equals(other.getEncryptedSeed()) && this.getIsProficientPlayer() == other.getIsProficientPlayer() && this.getKeyId() == other.getKeyId() && this.getUid() == other.getUid() && this.getAccountUid().equals(other.getAccountUid()) && this.getIsGuest() == other.getIsGuest() && this.getClientVersionRandomKey().equals(other.getClientVersionRandomKey()) && this.getUnk2800NNBFCEAOEPBList().equals(other.getUnk2800NNBFCEAOEPBList()) && this.getPlatformType() == other.getPlatformType() && this.getRegPlatform() == other.getRegPlatform() && this.getIsLoginWhiteList() == other.getIsLoginWhiteList() && this.getSeedSignature().equals(other.getSeedSignature()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 385;
            hash = 53 * hash + this.getBirthday().hashCode();
            hash = 37 * hash + 1534;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getSecurityCmdBuffer().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashLong(this.getSecretKeySeed());
            hash = 37 * hash + 1842;
            hash = 53 * hash + this.getCountryCode().hashCode();
            hash = 37 * hash + 324;
            hash = 53 * hash + this.getExtraBinData().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getSecretKey().hashCode();
            hash = 37 * hash + 1561;
            hash = 53 * hash + this.getUnk2700NOJPEHIBDJH();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getBlackUidEndTime();
            hash = 37 * hash + 1635;
            hash = 53 * hash + this.getTag();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getToken().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getGmUid();
            hash = 37 * hash + 896;
            hash = 53 * hash + this.getChannelId();
            hash = 37 * hash + 1811;
            hash = 53 * hash + this.getPsnId().hashCode();
            hash = 37 * hash + 860;
            hash = 53 * hash + this.getClientIpStr().hashCode();
            hash = 37 * hash + 842;
            hash = 53 * hash + this.getMsg().hashCode();
            hash = 37 * hash + 798;
            hash = 53 * hash + this.getAccountType();
            hash = 37 * hash + 1802;
            hash = 53 * hash + this.getSubChannelId();
            hash = 37 * hash + 2028;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700FLBKPCPGPDH());
            hash = 37 * hash + 415;
            hash = 53 * hash + this.getEncryptedSeed().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsProficientPlayer());
            hash = 37 * hash + 813;
            hash = 53 * hash + this.getKeyId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 48;
            hash = 53 * hash + this.getAccountUid().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsGuest());
            hash = 37 * hash + 1529;
            hash = 53 * hash + this.getClientVersionRandomKey().hashCode();
            if (this.getUnk2800NNBFCEAOEPBCount() > 0) {
                hash = 37 * hash + 1640;
                hash = 53 * hash + this.getUnk2800NNBFCEAOEPBList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getPlatformType();
            hash = 37 * hash + 1112;
            hash = 53 * hash + this.getRegPlatform();
            hash = 37 * hash + 573;
            hash = 53 * hash + Internal.hashBoolean(this.getIsLoginWhiteList());
            hash = 37 * hash + 1084;
            hash = 53 * hash + this.getSeedSignature().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetPlayerTokenRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data);
        }
        
        public static GetPlayerTokenRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerTokenRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerTokenRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenRsp.PARSER, input);
        }
        
        public static GetPlayerTokenRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerTokenRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerTokenRsp.PARSER, input);
        }
        
        public static GetPlayerTokenRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerTokenRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerTokenRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenRsp.PARSER, input);
        }
        
        public static GetPlayerTokenRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerTokenRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetPlayerTokenRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetPlayerTokenRsp prototype) {
            return GetPlayerTokenRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetPlayerTokenRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetPlayerTokenRsp getDefaultInstance() {
            return GetPlayerTokenRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetPlayerTokenRsp> parser() {
            return GetPlayerTokenRsp.PARSER;
        }
        
        @Override
        public Parser<GetPlayerTokenRsp> getParserForType() {
            return GetPlayerTokenRsp.PARSER;
        }
        
        @Override
        public GetPlayerTokenRsp getDefaultInstanceForType() {
            return GetPlayerTokenRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetPlayerTokenRsp();
            PARSER = new AbstractParser<GetPlayerTokenRsp>() {
                @Override
                public GetPlayerTokenRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetPlayerTokenRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetPlayerTokenRspOrBuilder
        {
            private int bitField0_;
            private Object birthday_;
            private int retcode_;
            private ByteString securityCmdBuffer_;
            private long secretKeySeed_;
            private Object countryCode_;
            private ByteString extraBinData_;
            private Object secretKey_;
            private int unk2700NOJPEHIBDJH_;
            private int blackUidEndTime_;
            private int tag_;
            private Object token_;
            private int gmUid_;
            private int channelId_;
            private Object psnId_;
            private Object clientIpStr_;
            private Object msg_;
            private int accountType_;
            private int subChannelId_;
            private boolean unk2700FLBKPCPGPDH_;
            private Object encryptedSeed_;
            private boolean isProficientPlayer_;
            private int keyId_;
            private int uid_;
            private Object accountUid_;
            private boolean isGuest_;
            private Object clientVersionRandomKey_;
            private Internal.IntList unk2800NNBFCEAOEPB_;
            private int platformType_;
            private int regPlatform_;
            private boolean isLoginWhiteList_;
            private Object seedSignature_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerTokenRsp.class, Builder.class);
            }
            
            private Builder() {
                this.birthday_ = "";
                this.securityCmdBuffer_ = ByteString.EMPTY;
                this.countryCode_ = "";
                this.extraBinData_ = ByteString.EMPTY;
                this.secretKey_ = "";
                this.token_ = "";
                this.psnId_ = "";
                this.clientIpStr_ = "";
                this.msg_ = "";
                this.encryptedSeed_ = "";
                this.accountUid_ = "";
                this.clientVersionRandomKey_ = "";
                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.emptyIntList();
                this.seedSignature_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.birthday_ = "";
                this.securityCmdBuffer_ = ByteString.EMPTY;
                this.countryCode_ = "";
                this.extraBinData_ = ByteString.EMPTY;
                this.secretKey_ = "";
                this.token_ = "";
                this.psnId_ = "";
                this.clientIpStr_ = "";
                this.msg_ = "";
                this.encryptedSeed_ = "";
                this.accountUid_ = "";
                this.clientVersionRandomKey_ = "";
                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.emptyIntList();
                this.seedSignature_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetPlayerTokenRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.birthday_ = "";
                this.retcode_ = 0;
                this.securityCmdBuffer_ = ByteString.EMPTY;
                this.secretKeySeed_ = 0L;
                this.countryCode_ = "";
                this.extraBinData_ = ByteString.EMPTY;
                this.secretKey_ = "";
                this.unk2700NOJPEHIBDJH_ = 0;
                this.blackUidEndTime_ = 0;
                this.tag_ = 0;
                this.token_ = "";
                this.gmUid_ = 0;
                this.channelId_ = 0;
                this.psnId_ = "";
                this.clientIpStr_ = "";
                this.msg_ = "";
                this.accountType_ = 0;
                this.subChannelId_ = 0;
                this.unk2700FLBKPCPGPDH_ = false;
                this.encryptedSeed_ = "";
                this.isProficientPlayer_ = false;
                this.keyId_ = 0;
                this.uid_ = 0;
                this.accountUid_ = "";
                this.isGuest_ = false;
                this.clientVersionRandomKey_ = "";
                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.platformType_ = 0;
                this.regPlatform_ = 0;
                this.isLoginWhiteList_ = false;
                this.seedSignature_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetPlayerTokenRspOuterClass.internal_static_GetPlayerTokenRsp_descriptor;
            }
            
            @Override
            public GetPlayerTokenRsp getDefaultInstanceForType() {
                return GetPlayerTokenRsp.getDefaultInstance();
            }
            
            @Override
            public GetPlayerTokenRsp build() {
                final GetPlayerTokenRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetPlayerTokenRsp buildPartial() {
                final GetPlayerTokenRsp result = new GetPlayerTokenRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.birthday_ = this.birthday_;
                result.retcode_ = this.retcode_;
                result.securityCmdBuffer_ = this.securityCmdBuffer_;
                result.secretKeySeed_ = this.secretKeySeed_;
                result.countryCode_ = this.countryCode_;
                result.extraBinData_ = this.extraBinData_;
                result.secretKey_ = this.secretKey_;
                result.unk2700NOJPEHIBDJH_ = this.unk2700NOJPEHIBDJH_;
                result.blackUidEndTime_ = this.blackUidEndTime_;
                result.tag_ = this.tag_;
                result.token_ = this.token_;
                result.gmUid_ = this.gmUid_;
                result.channelId_ = this.channelId_;
                result.psnId_ = this.psnId_;
                result.clientIpStr_ = this.clientIpStr_;
                result.msg_ = this.msg_;
                result.accountType_ = this.accountType_;
                result.subChannelId_ = this.subChannelId_;
                result.unk2700FLBKPCPGPDH_ = this.unk2700FLBKPCPGPDH_;
                result.encryptedSeed_ = this.encryptedSeed_;
                result.isProficientPlayer_ = this.isProficientPlayer_;
                result.keyId_ = this.keyId_;
                result.uid_ = this.uid_;
                result.accountUid_ = this.accountUid_;
                result.isGuest_ = this.isGuest_;
                result.clientVersionRandomKey_ = this.clientVersionRandomKey_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.unk2800NNBFCEAOEPB_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.unk2800NNBFCEAOEPB_ = this.unk2800NNBFCEAOEPB_;
                result.platformType_ = this.platformType_;
                result.regPlatform_ = this.regPlatform_;
                result.isLoginWhiteList_ = this.isLoginWhiteList_;
                result.seedSignature_ = this.seedSignature_;
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
                if (other instanceof GetPlayerTokenRsp) {
                    return this.mergeFrom((GetPlayerTokenRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetPlayerTokenRsp other) {
                if (other == GetPlayerTokenRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.getBirthday().isEmpty()) {
                    this.birthday_ = other.birthday_;
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getSecurityCmdBuffer() != ByteString.EMPTY) {
                    this.setSecurityCmdBuffer(other.getSecurityCmdBuffer());
                }
                if (other.getSecretKeySeed() != 0L) {
                    this.setSecretKeySeed(other.getSecretKeySeed());
                }
                if (!other.getCountryCode().isEmpty()) {
                    this.countryCode_ = other.countryCode_;
                    this.onChanged();
                }
                if (other.getExtraBinData() != ByteString.EMPTY) {
                    this.setExtraBinData(other.getExtraBinData());
                }
                if (!other.getSecretKey().isEmpty()) {
                    this.secretKey_ = other.secretKey_;
                    this.onChanged();
                }
                if (other.getUnk2700NOJPEHIBDJH() != 0) {
                    this.setUnk2700NOJPEHIBDJH(other.getUnk2700NOJPEHIBDJH());
                }
                if (other.getBlackUidEndTime() != 0) {
                    this.setBlackUidEndTime(other.getBlackUidEndTime());
                }
                if (other.getTag() != 0) {
                    this.setTag(other.getTag());
                }
                if (!other.getToken().isEmpty()) {
                    this.token_ = other.token_;
                    this.onChanged();
                }
                if (other.getGmUid() != 0) {
                    this.setGmUid(other.getGmUid());
                }
                if (other.getChannelId() != 0) {
                    this.setChannelId(other.getChannelId());
                }
                if (!other.getPsnId().isEmpty()) {
                    this.psnId_ = other.psnId_;
                    this.onChanged();
                }
                if (!other.getClientIpStr().isEmpty()) {
                    this.clientIpStr_ = other.clientIpStr_;
                    this.onChanged();
                }
                if (!other.getMsg().isEmpty()) {
                    this.msg_ = other.msg_;
                    this.onChanged();
                }
                if (other.getAccountType() != 0) {
                    this.setAccountType(other.getAccountType());
                }
                if (other.getSubChannelId() != 0) {
                    this.setSubChannelId(other.getSubChannelId());
                }
                if (other.getUnk2700FLBKPCPGPDH()) {
                    this.setUnk2700FLBKPCPGPDH(other.getUnk2700FLBKPCPGPDH());
                }
                if (!other.getEncryptedSeed().isEmpty()) {
                    this.encryptedSeed_ = other.encryptedSeed_;
                    this.onChanged();
                }
                if (other.getIsProficientPlayer()) {
                    this.setIsProficientPlayer(other.getIsProficientPlayer());
                }
                if (other.getKeyId() != 0) {
                    this.setKeyId(other.getKeyId());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (!other.getAccountUid().isEmpty()) {
                    this.accountUid_ = other.accountUid_;
                    this.onChanged();
                }
                if (other.getIsGuest()) {
                    this.setIsGuest(other.getIsGuest());
                }
                if (!other.getClientVersionRandomKey().isEmpty()) {
                    this.clientVersionRandomKey_ = other.clientVersionRandomKey_;
                    this.onChanged();
                }
                if (!other.unk2800NNBFCEAOEPB_.isEmpty()) {
                    if (this.unk2800NNBFCEAOEPB_.isEmpty()) {
                        this.unk2800NNBFCEAOEPB_ = other.unk2800NNBFCEAOEPB_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureUnk2800NNBFCEAOEPBIsMutable();
                        this.unk2800NNBFCEAOEPB_.addAll(other.unk2800NNBFCEAOEPB_);
                    }
                    this.onChanged();
                }
                if (other.getPlatformType() != 0) {
                    this.setPlatformType(other.getPlatformType());
                }
                if (other.getRegPlatform() != 0) {
                    this.setRegPlatform(other.getRegPlatform());
                }
                if (other.getIsLoginWhiteList()) {
                    this.setIsLoginWhiteList(other.getIsLoginWhiteList());
                }
                if (!other.getSeedSignature().isEmpty()) {
                    this.seedSignature_ = other.seedSignature_;
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
                GetPlayerTokenRsp parsedMessage = null;
                try {
                    parsedMessage = GetPlayerTokenRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetPlayerTokenRsp)e.getUnfinishedMessage();
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
            public String getBirthday() {
                final Object ref = this.birthday_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.birthday_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getBirthdayBytes() {
                final Object ref = this.birthday_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.birthday_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setBirthday(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.birthday_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBirthday() {
                this.birthday_ = GetPlayerTokenRsp.getDefaultInstance().getBirthday();
                this.onChanged();
                return this;
            }
            
            public Builder setBirthdayBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.birthday_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getSecurityCmdBuffer() {
                return this.securityCmdBuffer_;
            }
            
            public Builder setSecurityCmdBuffer(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.securityCmdBuffer_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSecurityCmdBuffer() {
                this.securityCmdBuffer_ = GetPlayerTokenRsp.getDefaultInstance().getSecurityCmdBuffer();
                this.onChanged();
                return this;
            }
            
            @Override
            public long getSecretKeySeed() {
                return this.secretKeySeed_;
            }
            
            public Builder setSecretKeySeed(final long value) {
                this.secretKeySeed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSecretKeySeed() {
                this.secretKeySeed_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCountryCode() {
                final Object ref = this.countryCode_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.countryCode_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCountryCodeBytes() {
                final Object ref = this.countryCode_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.countryCode_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCountryCode(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.countryCode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCountryCode() {
                this.countryCode_ = GetPlayerTokenRsp.getDefaultInstance().getCountryCode();
                this.onChanged();
                return this;
            }
            
            public Builder setCountryCodeBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.countryCode_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getExtraBinData() {
                return this.extraBinData_;
            }
            
            public Builder setExtraBinData(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.extraBinData_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExtraBinData() {
                this.extraBinData_ = GetPlayerTokenRsp.getDefaultInstance().getExtraBinData();
                this.onChanged();
                return this;
            }
            
            @Override
            public String getSecretKey() {
                final Object ref = this.secretKey_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.secretKey_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSecretKeyBytes() {
                final Object ref = this.secretKey_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.secretKey_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSecretKey(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.secretKey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSecretKey() {
                this.secretKey_ = GetPlayerTokenRsp.getDefaultInstance().getSecretKey();
                this.onChanged();
                return this;
            }
            
            public Builder setSecretKeyBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.secretKey_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700NOJPEHIBDJH() {
                return this.unk2700NOJPEHIBDJH_;
            }
            
            public Builder setUnk2700NOJPEHIBDJH(final int value) {
                this.unk2700NOJPEHIBDJH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700NOJPEHIBDJH() {
                this.unk2700NOJPEHIBDJH_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBlackUidEndTime() {
                return this.blackUidEndTime_;
            }
            
            public Builder setBlackUidEndTime(final int value) {
                this.blackUidEndTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBlackUidEndTime() {
                this.blackUidEndTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTag() {
                return this.tag_;
            }
            
            public Builder setTag(final int value) {
                this.tag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTag() {
                this.tag_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getToken() {
                final Object ref = this.token_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.token_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTokenBytes() {
                final Object ref = this.token_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.token_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setToken(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.token_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearToken() {
                this.token_ = GetPlayerTokenRsp.getDefaultInstance().getToken();
                this.onChanged();
                return this;
            }
            
            public Builder setTokenBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.token_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGmUid() {
                return this.gmUid_;
            }
            
            public Builder setGmUid(final int value) {
                this.gmUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGmUid() {
                this.gmUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChannelId() {
                return this.channelId_;
            }
            
            public Builder setChannelId(final int value) {
                this.channelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChannelId() {
                this.channelId_ = 0;
                this.onChanged();
                return this;
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
                this.psnId_ = GetPlayerTokenRsp.getDefaultInstance().getPsnId();
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
            public String getClientIpStr() {
                final Object ref = this.clientIpStr_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientIpStr_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientIpStrBytes() {
                final Object ref = this.clientIpStr_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientIpStr_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientIpStr(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientIpStr_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientIpStr() {
                this.clientIpStr_ = GetPlayerTokenRsp.getDefaultInstance().getClientIpStr();
                this.onChanged();
                return this;
            }
            
            public Builder setClientIpStrBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientIpStr_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getMsg() {
                final Object ref = this.msg_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.msg_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getMsgBytes() {
                final Object ref = this.msg_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.msg_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setMsg(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.msg_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMsg() {
                this.msg_ = GetPlayerTokenRsp.getDefaultInstance().getMsg();
                this.onChanged();
                return this;
            }
            
            public Builder setMsgBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.msg_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAccountType() {
                return this.accountType_;
            }
            
            public Builder setAccountType(final int value) {
                this.accountType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountType() {
                this.accountType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSubChannelId() {
                return this.subChannelId_;
            }
            
            public Builder setSubChannelId(final int value) {
                this.subChannelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSubChannelId() {
                this.subChannelId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700FLBKPCPGPDH() {
                return this.unk2700FLBKPCPGPDH_;
            }
            
            public Builder setUnk2700FLBKPCPGPDH(final boolean value) {
                this.unk2700FLBKPCPGPDH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700FLBKPCPGPDH() {
                this.unk2700FLBKPCPGPDH_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getEncryptedSeed() {
                final Object ref = this.encryptedSeed_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.encryptedSeed_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getEncryptedSeedBytes() {
                final Object ref = this.encryptedSeed_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.encryptedSeed_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setEncryptedSeed(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.encryptedSeed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEncryptedSeed() {
                this.encryptedSeed_ = GetPlayerTokenRsp.getDefaultInstance().getEncryptedSeed();
                this.onChanged();
                return this;
            }
            
            public Builder setEncryptedSeedBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.encryptedSeed_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsProficientPlayer() {
                return this.isProficientPlayer_;
            }
            
            public Builder setIsProficientPlayer(final boolean value) {
                this.isProficientPlayer_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsProficientPlayer() {
                this.isProficientPlayer_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getKeyId() {
                return this.keyId_;
            }
            
            public Builder setKeyId(final int value) {
                this.keyId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKeyId() {
                this.keyId_ = 0;
                this.onChanged();
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
            public String getAccountUid() {
                final Object ref = this.accountUid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.accountUid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAccountUidBytes() {
                final Object ref = this.accountUid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.accountUid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAccountUid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.accountUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAccountUid() {
                this.accountUid_ = GetPlayerTokenRsp.getDefaultInstance().getAccountUid();
                this.onChanged();
                return this;
            }
            
            public Builder setAccountUidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.accountUid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsGuest() {
                return this.isGuest_;
            }
            
            public Builder setIsGuest(final boolean value) {
                this.isGuest_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsGuest() {
                this.isGuest_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientVersionRandomKey() {
                final Object ref = this.clientVersionRandomKey_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientVersionRandomKey_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientVersionRandomKeyBytes() {
                final Object ref = this.clientVersionRandomKey_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientVersionRandomKey_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientVersionRandomKey(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientVersionRandomKey_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientVersionRandomKey() {
                this.clientVersionRandomKey_ = GetPlayerTokenRsp.getDefaultInstance().getClientVersionRandomKey();
                this.onChanged();
                return this;
            }
            
            public Builder setClientVersionRandomKeyBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientVersionRandomKey_ = value;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2800NNBFCEAOEPBIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.mutableCopy(this.unk2800NNBFCEAOEPB_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getUnk2800NNBFCEAOEPBList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.unk2800NNBFCEAOEPB_) : this.unk2800NNBFCEAOEPB_;
            }
            
            @Override
            public int getUnk2800NNBFCEAOEPBCount() {
                return this.unk2800NNBFCEAOEPB_.size();
            }
            
            @Override
            public int getUnk2800NNBFCEAOEPB(final int index) {
                return this.unk2800NNBFCEAOEPB_.getInt(index);
            }
            
            public Builder setUnk2800NNBFCEAOEPB(final int index, final int value) {
                this.ensureUnk2800NNBFCEAOEPBIsMutable();
                this.unk2800NNBFCEAOEPB_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addUnk2800NNBFCEAOEPB(final int value) {
                this.ensureUnk2800NNBFCEAOEPBIsMutable();
                this.unk2800NNBFCEAOEPB_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllUnk2800NNBFCEAOEPB(final Iterable<? extends Integer> values) {
                this.ensureUnk2800NNBFCEAOEPBIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.unk2800NNBFCEAOEPB_);
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2800NNBFCEAOEPB() {
                this.unk2800NNBFCEAOEPB_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPlatformType() {
                return this.platformType_;
            }
            
            public Builder setPlatformType(final int value) {
                this.platformType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPlatformType() {
                this.platformType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRegPlatform() {
                return this.regPlatform_;
            }
            
            public Builder setRegPlatform(final int value) {
                this.regPlatform_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRegPlatform() {
                this.regPlatform_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsLoginWhiteList() {
                return this.isLoginWhiteList_;
            }
            
            public Builder setIsLoginWhiteList(final boolean value) {
                this.isLoginWhiteList_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsLoginWhiteList() {
                this.isLoginWhiteList_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getSeedSignature() {
                final Object ref = this.seedSignature_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.seedSignature_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSeedSignatureBytes() {
                final Object ref = this.seedSignature_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.seedSignature_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSeedSignature(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.seedSignature_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSeedSignature() {
                this.seedSignature_ = GetPlayerTokenRsp.getDefaultInstance().getSeedSignature();
                this.onChanged();
                return this;
            }
            
            public Builder setSeedSignatureBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.seedSignature_ = value;
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
    
    public interface GetPlayerTokenRspOrBuilder extends MessageOrBuilder
    {
        String getBirthday();
        
        ByteString getBirthdayBytes();
        
        int getRetcode();
        
        ByteString getSecurityCmdBuffer();
        
        long getSecretKeySeed();
        
        String getCountryCode();
        
        ByteString getCountryCodeBytes();
        
        ByteString getExtraBinData();
        
        String getSecretKey();
        
        ByteString getSecretKeyBytes();
        
        int getUnk2700NOJPEHIBDJH();
        
        int getBlackUidEndTime();
        
        int getTag();
        
        String getToken();
        
        ByteString getTokenBytes();
        
        int getGmUid();
        
        int getChannelId();
        
        String getPsnId();
        
        ByteString getPsnIdBytes();
        
        String getClientIpStr();
        
        ByteString getClientIpStrBytes();
        
        String getMsg();
        
        ByteString getMsgBytes();
        
        int getAccountType();
        
        int getSubChannelId();
        
        boolean getUnk2700FLBKPCPGPDH();
        
        String getEncryptedSeed();
        
        ByteString getEncryptedSeedBytes();
        
        boolean getIsProficientPlayer();
        
        int getKeyId();
        
        int getUid();
        
        String getAccountUid();
        
        ByteString getAccountUidBytes();
        
        boolean getIsGuest();
        
        String getClientVersionRandomKey();
        
        ByteString getClientVersionRandomKeyBytes();
        
        List<Integer> getUnk2800NNBFCEAOEPBList();
        
        int getUnk2800NNBFCEAOEPBCount();
        
        int getUnk2800NNBFCEAOEPB(final int p0);
        
        int getPlatformType();
        
        int getRegPlatform();
        
        boolean getIsLoginWhiteList();
        
        String getSeedSignature();
        
        ByteString getSeedSignatureBytes();
    }
}
