// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ProtocolMessageEnum;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerApplyEnterMpResultNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerApplyEnterMpResultNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerApplyEnterMpResultNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpResultNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpResultNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n$PlayerApplyEnterMpResultNotify.proto\"\u00ed\u0004\n\u001ePlayerApplyEnterMpResultNotify\u0012\u0011\n\tis_agreed\u0018\u0002 \u0001(\b\u0012\u0017\n\u000ftarget_nickname\u0018\f \u0001(\t\u00126\n\u0006reason\u0018\r \u0001(\u000e2&.PlayerApplyEnterMpResultNotify.Reason\u0012\u0012\n\ntarget_uid\u0018\u0001 \u0001(\r\"\u00d2\u0003\n\u0006Reason\u0012\u0017\n\u0013REASON_PLAYER_JUDGE\u0010\u0000\u0012\u001d\n\u0019REASON_SCENE_CANNOT_ENTER\u0010\u0001\u0012!\n\u001dREASON_PLAYER_CANNOT_ENTER_MP\u0010\u0002\u0012\u0017\n\u0013REASON_SYSTEM_JUDGE\u0010\u0003\u0012\"\n\u001eREASON_ALLOW_ENTER_PLAYER_FULL\u0010\u0004\u0012&\n\"REASON_WORLD_LEVEL_LOWER_THAN_HOST\u0010\u0005\u0012\u0018\n\u0014REASON_HOST_IN_MATCH\u0010\u0006\u0012\u001e\n\u001aREASON_PLAYER_IN_BLACKLIST\u0010\u0007\u0012&\n\"REASON_PS_PLAYER_NOT_ACCEPT_OTHERS\u0010\b\u0012\u001a\n\u0016REASON_HOST_IS_BLOCKED\u0010\t\u0012(\n$REASON_OTHER_DATA_VERSION_NOT_LATEST\u0010\n\u0012\"\n\u001eREASON_DATA_VERSION_NOT_LATEST\u0010\u000b\u0012%\n!REASON_PLAYER_NOT_IN_PLAYER_WORLD\u0010\f\u0012\u0015\n\u0011REASON_MAX_PLAYER\u0010\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpResultNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerApplyEnterMpResultNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerApplyEnterMpResultNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_descriptor, new String[] { "IsAgreed", "TargetNickname", "Reason", "TargetUid" });
    }
    
    public static final class PlayerApplyEnterMpResultNotify extends GeneratedMessageV3 implements PlayerApplyEnterMpResultNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_AGREED_FIELD_NUMBER = 2;
        private boolean isAgreed_;
        public static final int TARGET_NICKNAME_FIELD_NUMBER = 12;
        private volatile Object targetNickname_;
        public static final int REASON_FIELD_NUMBER = 13;
        private int reason_;
        public static final int TARGET_UID_FIELD_NUMBER = 1;
        private int targetUid_;
        private byte memoizedIsInitialized;
        private static final PlayerApplyEnterMpResultNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerApplyEnterMpResultNotify> PARSER;
        
        private PlayerApplyEnterMpResultNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerApplyEnterMpResultNotify() {
            this.memoizedIsInitialized = -1;
            this.targetNickname_ = "";
            this.reason_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerApplyEnterMpResultNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerApplyEnterMpResultNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.isAgreed_ = input.readBool();
                            continue;
                        }
                        case 98: {
                            final String s = input.readStringRequireUtf8();
                            this.targetNickname_ = s;
                            continue;
                        }
                        case 104: {
                            final int rawValue = input.readEnum();
                            this.reason_ = rawValue;
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsAgreed() {
            return this.isAgreed_;
        }
        
        @Override
        public String getTargetNickname() {
            final Object ref = this.targetNickname_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.targetNickname_ = s);
        }
        
        @Override
        public ByteString getTargetNicknameBytes() {
            final Object ref = this.targetNickname_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.targetNickname_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getReasonValue() {
            return this.reason_;
        }
        
        @Override
        public Reason getReason() {
            final Reason result = Reason.valueOf(this.reason_);
            return (result == null) ? Reason.UNRECOGNIZED : result;
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
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
            if (this.targetUid_ != 0) {
                output.writeUInt32(1, this.targetUid_);
            }
            if (this.isAgreed_) {
                output.writeBool(2, this.isAgreed_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.targetNickname_)) {
                GeneratedMessageV3.writeString(output, 12, this.targetNickname_);
            }
            if (this.reason_ != Reason.REASON_PLAYER_JUDGE.getNumber()) {
                output.writeEnum(13, this.reason_);
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
            if (this.targetUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.targetUid_);
            }
            if (this.isAgreed_) {
                size += CodedOutputStream.computeBoolSize(2, this.isAgreed_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.targetNickname_)) {
                size += GeneratedMessageV3.computeStringSize(12, this.targetNickname_);
            }
            if (this.reason_ != Reason.REASON_PLAYER_JUDGE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(13, this.reason_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerApplyEnterMpResultNotify)) {
                return super.equals(obj);
            }
            final PlayerApplyEnterMpResultNotify other = (PlayerApplyEnterMpResultNotify)obj;
            return this.getIsAgreed() == other.getIsAgreed() && this.getTargetNickname().equals(other.getTargetNickname()) && this.reason_ == other.reason_ && this.getTargetUid() == other.getTargetUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAgreed());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getTargetNickname().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.reason_;
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getTargetUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerApplyEnterMpResultNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerApplyEnterMpResultNotify prototype) {
            return PlayerApplyEnterMpResultNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerApplyEnterMpResultNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerApplyEnterMpResultNotify getDefaultInstance() {
            return PlayerApplyEnterMpResultNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerApplyEnterMpResultNotify> parser() {
            return PlayerApplyEnterMpResultNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerApplyEnterMpResultNotify> getParserForType() {
            return PlayerApplyEnterMpResultNotify.PARSER;
        }
        
        @Override
        public PlayerApplyEnterMpResultNotify getDefaultInstanceForType() {
            return PlayerApplyEnterMpResultNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerApplyEnterMpResultNotify();
            PARSER = new AbstractParser<PlayerApplyEnterMpResultNotify>() {
                @Override
                public PlayerApplyEnterMpResultNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerApplyEnterMpResultNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum Reason implements ProtocolMessageEnum
        {
            REASON_PLAYER_JUDGE(0), 
            REASON_SCENE_CANNOT_ENTER(1), 
            REASON_PLAYER_CANNOT_ENTER_MP(2), 
            REASON_SYSTEM_JUDGE(3), 
            REASON_ALLOW_ENTER_PLAYER_FULL(4), 
            REASON_WORLD_LEVEL_LOWER_THAN_HOST(5), 
            REASON_HOST_IN_MATCH(6), 
            REASON_PLAYER_IN_BLACKLIST(7), 
            REASON_PS_PLAYER_NOT_ACCEPT_OTHERS(8), 
            REASON_HOST_IS_BLOCKED(9), 
            REASON_OTHER_DATA_VERSION_NOT_LATEST(10), 
            REASON_DATA_VERSION_NOT_LATEST(11), 
            REASON_PLAYER_NOT_IN_PLAYER_WORLD(12), 
            REASON_MAX_PLAYER(13), 
            UNRECOGNIZED(-1);
            
            public static final int REASON_PLAYER_JUDGE_VALUE = 0;
            public static final int REASON_SCENE_CANNOT_ENTER_VALUE = 1;
            public static final int REASON_PLAYER_CANNOT_ENTER_MP_VALUE = 2;
            public static final int REASON_SYSTEM_JUDGE_VALUE = 3;
            public static final int REASON_ALLOW_ENTER_PLAYER_FULL_VALUE = 4;
            public static final int REASON_WORLD_LEVEL_LOWER_THAN_HOST_VALUE = 5;
            public static final int REASON_HOST_IN_MATCH_VALUE = 6;
            public static final int REASON_PLAYER_IN_BLACKLIST_VALUE = 7;
            public static final int REASON_PS_PLAYER_NOT_ACCEPT_OTHERS_VALUE = 8;
            public static final int REASON_HOST_IS_BLOCKED_VALUE = 9;
            public static final int REASON_OTHER_DATA_VERSION_NOT_LATEST_VALUE = 10;
            public static final int REASON_DATA_VERSION_NOT_LATEST_VALUE = 11;
            public static final int REASON_PLAYER_NOT_IN_PLAYER_WORLD_VALUE = 12;
            public static final int REASON_MAX_PLAYER_VALUE = 13;
            private static final Internal.EnumLiteMap<Reason> internalValueMap;
            private static final Reason[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == Reason.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static Reason valueOf(final int value) {
                return forNumber(value);
            }
            
            public static Reason forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return Reason.REASON_PLAYER_JUDGE;
                    }
                    case 1: {
                        return Reason.REASON_SCENE_CANNOT_ENTER;
                    }
                    case 2: {
                        return Reason.REASON_PLAYER_CANNOT_ENTER_MP;
                    }
                    case 3: {
                        return Reason.REASON_SYSTEM_JUDGE;
                    }
                    case 4: {
                        return Reason.REASON_ALLOW_ENTER_PLAYER_FULL;
                    }
                    case 5: {
                        return Reason.REASON_WORLD_LEVEL_LOWER_THAN_HOST;
                    }
                    case 6: {
                        return Reason.REASON_HOST_IN_MATCH;
                    }
                    case 7: {
                        return Reason.REASON_PLAYER_IN_BLACKLIST;
                    }
                    case 8: {
                        return Reason.REASON_PS_PLAYER_NOT_ACCEPT_OTHERS;
                    }
                    case 9: {
                        return Reason.REASON_HOST_IS_BLOCKED;
                    }
                    case 10: {
                        return Reason.REASON_OTHER_DATA_VERSION_NOT_LATEST;
                    }
                    case 11: {
                        return Reason.REASON_DATA_VERSION_NOT_LATEST;
                    }
                    case 12: {
                        return Reason.REASON_PLAYER_NOT_IN_PLAYER_WORLD;
                    }
                    case 13: {
                        return Reason.REASON_MAX_PLAYER;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<Reason> internalGetValueMap() {
                return Reason.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == Reason.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PlayerApplyEnterMpResultNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static Reason valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return Reason.UNRECOGNIZED;
                }
                return Reason.VALUES[desc.getIndex()];
            }
            
            private Reason(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ Reason[] value() {
                return new Reason[] { Reason.REASON_PLAYER_JUDGE, Reason.REASON_SCENE_CANNOT_ENTER, Reason.REASON_PLAYER_CANNOT_ENTER_MP, Reason.REASON_SYSTEM_JUDGE, Reason.REASON_ALLOW_ENTER_PLAYER_FULL, Reason.REASON_WORLD_LEVEL_LOWER_THAN_HOST, Reason.REASON_HOST_IN_MATCH, Reason.REASON_PLAYER_IN_BLACKLIST, Reason.REASON_PS_PLAYER_NOT_ACCEPT_OTHERS, Reason.REASON_HOST_IS_BLOCKED, Reason.REASON_OTHER_DATA_VERSION_NOT_LATEST, Reason.REASON_DATA_VERSION_NOT_LATEST, Reason.REASON_PLAYER_NOT_IN_PLAYER_WORLD, Reason.REASON_MAX_PLAYER, Reason.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<Reason>() {
                    @Override
                    public Reason findValueByNumber(final int number) {
                        return Reason.forNumber(number);
                    }
                };

        }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerApplyEnterMpResultNotifyOrBuilder
        {
            private boolean isAgreed_;
            private Object targetNickname_;
            private int reason_;
            private int targetUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultNotify.class, Builder.class);
            }
            
            private Builder() {
                this.targetNickname_ = "";
                this.reason_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.targetNickname_ = "";
                this.reason_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerApplyEnterMpResultNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAgreed_ = false;
                this.targetNickname_ = "";
                this.reason_ = 0;
                this.targetUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerApplyEnterMpResultNotifyOuterClass.internal_static_PlayerApplyEnterMpResultNotify_descriptor;
            }
            
            @Override
            public PlayerApplyEnterMpResultNotify getDefaultInstanceForType() {
                return PlayerApplyEnterMpResultNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerApplyEnterMpResultNotify build() {
                final PlayerApplyEnterMpResultNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerApplyEnterMpResultNotify buildPartial() {
                final PlayerApplyEnterMpResultNotify result = new PlayerApplyEnterMpResultNotify(this);
                result.isAgreed_ = this.isAgreed_;
                result.targetNickname_ = this.targetNickname_;
                result.reason_ = this.reason_;
                result.targetUid_ = this.targetUid_;
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
                if (other instanceof PlayerApplyEnterMpResultNotify) {
                    return this.mergeFrom((PlayerApplyEnterMpResultNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerApplyEnterMpResultNotify other) {
                if (other == PlayerApplyEnterMpResultNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAgreed()) {
                    this.setIsAgreed(other.getIsAgreed());
                }
                if (!other.getTargetNickname().isEmpty()) {
                    this.targetNickname_ = other.targetNickname_;
                    this.onChanged();
                }
                if (other.reason_ != 0) {
                    this.setReasonValue(other.getReasonValue());
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
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
                PlayerApplyEnterMpResultNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerApplyEnterMpResultNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerApplyEnterMpResultNotify)e.getUnfinishedMessage();
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
            public boolean getIsAgreed() {
                return this.isAgreed_;
            }
            
            public Builder setIsAgreed(final boolean value) {
                this.isAgreed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAgreed() {
                this.isAgreed_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getTargetNickname() {
                final Object ref = this.targetNickname_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.targetNickname_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTargetNicknameBytes() {
                final Object ref = this.targetNickname_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.targetNickname_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setTargetNickname(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.targetNickname_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetNickname() {
                this.targetNickname_ = PlayerApplyEnterMpResultNotify.getDefaultInstance().getTargetNickname();
                this.onChanged();
                return this;
            }
            
            public Builder setTargetNicknameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.targetNickname_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getReasonValue() {
                return this.reason_;
            }
            
            public Builder setReasonValue(final int value) {
                this.reason_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public Reason getReason() {
                final Reason result = Reason.valueOf(this.reason_);
                return (result == null) ? Reason.UNRECOGNIZED : result;
            }
            
            public Builder setReason(final Reason value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.reason_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearReason() {
                this.reason_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetUid() {
                return this.targetUid_;
            }
            
            public Builder setTargetUid(final int value) {
                this.targetUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetUid() {
                this.targetUid_ = 0;
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
    
    public interface PlayerApplyEnterMpResultNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsAgreed();
        
        String getTargetNickname();
        
        ByteString getTargetNicknameBytes();
        
        int getReasonValue();
        
        PlayerApplyEnterMpResultNotify.Reason getReason();
        
        int getTargetUid();
    }
}
