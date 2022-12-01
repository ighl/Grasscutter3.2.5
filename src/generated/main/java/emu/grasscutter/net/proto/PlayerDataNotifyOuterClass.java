// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerDataNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PlayerDataNotify_PropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerDataNotify_PropMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016PlayerDataNotify.proto\u001a\u000fPropValue.proto\"\u00d9\u0001\n\u0010PlayerDataNotify\u0012\u0013\n\u000bserver_time\u0018\u000f \u0001(\u0004\u0012\u0011\n\tnick_name\u0018\u0002 \u0001(\t\u0012\u001c\n\u0014is_first_login_today\u0018\u000e \u0001(\b\u0012\u0011\n\tregion_id\u0018\f \u0001(\r\u00120\n\bprop_map\u0018\u0007 \u0003(\u000b2\u001e.PlayerDataNotify.PropMapEntry\u001a:\n\fPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u0019\n\u0005value\u0018\u0002 \u0001(\u000b2\n.PropValue:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PropValueOuterClass.getDescriptor() });
        internal_static_PlayerDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_descriptor, new String[] { "ServerTime", "NickName", "IsFirstLoginToday", "RegionId", "PropMap" });
        internal_static_PlayerDataNotify_PropMapEntry_descriptor = PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_descriptor.getNestedTypes().get(0);
        internal_static_PlayerDataNotify_PropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_PropMapEntry_descriptor, new String[] { "Key", "Value" });
        PropValueOuterClass.getDescriptor();
    }
    
    public static final class PlayerDataNotify extends GeneratedMessageV3 implements PlayerDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_TIME_FIELD_NUMBER = 15;
        private long serverTime_;
        public static final int NICK_NAME_FIELD_NUMBER = 2;
        private volatile Object nickName_;
        public static final int IS_FIRST_LOGIN_TODAY_FIELD_NUMBER = 14;
        private boolean isFirstLoginToday_;
        public static final int REGION_ID_FIELD_NUMBER = 12;
        private int regionId_;
        public static final int PROP_MAP_FIELD_NUMBER = 7;
        private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
        private byte memoizedIsInitialized;
        private static final PlayerDataNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerDataNotify> PARSER;
        
        private PlayerDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerDataNotify() {
            this.memoizedIsInitialized = -1;
            this.nickName_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.nickName_ = s;
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.propMap_ = MapField.newMapField(PropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = input.readMessage(PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.propMap_.getMutableMap().put(propMap__.getKey(), propMap__.getValue());
                            continue;
                        }
                        case 96: {
                            this.regionId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.isFirstLoginToday_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.serverTime_ = input.readUInt64();
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
            return PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 7: {
                    return this.internalGetPropMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerDataNotify.class, Builder.class);
        }
        
        @Override
        public long getServerTime() {
            return this.serverTime_;
        }
        
        @Override
        public String getNickName() {
            final Object ref = this.nickName_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.nickName_ = s);
        }
        
        @Override
        public ByteString getNickNameBytes() {
            final Object ref = this.nickName_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.nickName_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean getIsFirstLoginToday() {
            return this.isFirstLoginToday_;
        }
        
        @Override
        public int getRegionId() {
            return this.regionId_;
        }
        
        private MapField<Integer, PropValueOuterClass.PropValue> internalGetPropMap() {
            if (this.propMap_ == null) {
                return MapField.emptyMapField(PropMapDefaultEntryHolder.defaultEntry);
            }
            return this.propMap_;
        }
        
        @Override
        public int getPropMapCount() {
            return this.internalGetPropMap().getMap().size();
        }
        
        @Override
        public boolean containsPropMap(final int key) {
            return this.internalGetPropMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getPropMap() {
            return this.getPropMapMap();
        }
        
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getPropMapMap() {
            return this.internalGetPropMap().getMap();
        }
        
        @Override
        public PropValueOuterClass.PropValue getPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public PropValueOuterClass.PropValue getPropMapOrThrow(final int key) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
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
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                GeneratedMessageV3.writeString(output, 2, this.nickName_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetPropMap(), PropMapDefaultEntryHolder.defaultEntry, 7);
            if (this.regionId_ != 0) {
                output.writeUInt32(12, this.regionId_);
            }
            if (this.isFirstLoginToday_) {
                output.writeBool(14, this.isFirstLoginToday_);
            }
            if (this.serverTime_ != 0L) {
                output.writeUInt64(15, this.serverTime_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.nickName_);
            }
            for (final Map.Entry<Integer, PropValueOuterClass.PropValue> entry : this.internalGetPropMap().getMap().entrySet()) {
                final MapEntry<Integer, PropValueOuterClass.PropValue> propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(7, propMap__);
            }
            if (this.regionId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.regionId_);
            }
            if (this.isFirstLoginToday_) {
                size += CodedOutputStream.computeBoolSize(14, this.isFirstLoginToday_);
            }
            if (this.serverTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(15, this.serverTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerDataNotify)) {
                return super.equals(obj);
            }
            final PlayerDataNotify other = (PlayerDataNotify)obj;
            return this.getServerTime() == other.getServerTime() && this.getNickName().equals(other.getNickName()) && this.getIsFirstLoginToday() == other.getIsFirstLoginToday() && this.getRegionId() == other.getRegionId() && this.internalGetPropMap().equals(other.internalGetPropMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getServerTime());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getNickName().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashBoolean(this.getIsFirstLoginToday());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getRegionId();
            if (!this.internalGetPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.internalGetPropMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerDataNotify.PARSER, input);
        }
        
        public static PlayerDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerDataNotify.PARSER, input);
        }
        
        public static PlayerDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerDataNotify.PARSER, input);
        }
        
        public static PlayerDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerDataNotify prototype) {
            return PlayerDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerDataNotify getDefaultInstance() {
            return PlayerDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerDataNotify> parser() {
            return PlayerDataNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerDataNotify> getParserForType() {
            return PlayerDataNotify.PARSER;
        }
        
        @Override
        public PlayerDataNotify getDefaultInstanceForType() {
            return PlayerDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerDataNotify();
            PARSER = new AbstractParser<PlayerDataNotify>() {
                @Override
                public PlayerDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerDataNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class PropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, PropValueOuterClass.PropValue> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_PropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, PropValueOuterClass.PropValue.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerDataNotifyOrBuilder
        {
            private int bitField0_;
            private long serverTime_;
            private Object nickName_;
            private boolean isFirstLoginToday_;
            private int regionId_;
            private MapField<Integer, PropValueOuterClass.PropValue> propMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 7: {
                        return this.internalGetPropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 7: {
                        return this.internalGetMutablePropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.nickName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.nickName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.serverTime_ = 0L;
                this.nickName_ = "";
                this.isFirstLoginToday_ = false;
                this.regionId_ = 0;
                this.internalGetMutablePropMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerDataNotifyOuterClass.internal_static_PlayerDataNotify_descriptor;
            }
            
            @Override
            public PlayerDataNotify getDefaultInstanceForType() {
                return PlayerDataNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerDataNotify build() {
                final PlayerDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerDataNotify buildPartial() {
                final PlayerDataNotify result = new PlayerDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.serverTime_ = this.serverTime_;
                result.nickName_ = this.nickName_;
                result.isFirstLoginToday_ = this.isFirstLoginToday_;
                result.regionId_ = this.regionId_;
                (result.propMap_ = this.internalGetPropMap()).makeImmutable();
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
                if (other instanceof PlayerDataNotify) {
                    return this.mergeFrom((PlayerDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerDataNotify other) {
                if (other == PlayerDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getServerTime() != 0L) {
                    this.setServerTime(other.getServerTime());
                }
                if (!other.getNickName().isEmpty()) {
                    this.nickName_ = other.nickName_;
                    this.onChanged();
                }
                if (other.getIsFirstLoginToday()) {
                    this.setIsFirstLoginToday(other.getIsFirstLoginToday());
                }
                if (other.getRegionId() != 0) {
                    this.setRegionId(other.getRegionId());
                }
                this.internalGetMutablePropMap().mergeFrom(other.internalGetPropMap());
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
                PlayerDataNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerDataNotify)e.getUnfinishedMessage();
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
            public long getServerTime() {
                return this.serverTime_;
            }
            
            public Builder setServerTime(final long value) {
                this.serverTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearServerTime() {
                this.serverTime_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getNickName() {
                final Object ref = this.nickName_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.nickName_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNickNameBytes() {
                final Object ref = this.nickName_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.nickName_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setNickName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.nickName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNickName() {
                this.nickName_ = PlayerDataNotify.getDefaultInstance().getNickName();
                this.onChanged();
                return this;
            }
            
            public Builder setNickNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.nickName_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsFirstLoginToday() {
                return this.isFirstLoginToday_;
            }
            
            public Builder setIsFirstLoginToday(final boolean value) {
                this.isFirstLoginToday_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsFirstLoginToday() {
                this.isFirstLoginToday_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRegionId() {
                return this.regionId_;
            }
            
            public Builder setRegionId(final int value) {
                this.regionId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRegionId() {
                this.regionId_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetPropMap() {
                if (this.propMap_ == null) {
                    return MapField.emptyMapField(PropMapDefaultEntryHolder.defaultEntry);
                }
                return this.propMap_;
            }
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetMutablePropMap() {
                this.onChanged();
                if (this.propMap_ == null) {
                    this.propMap_ = MapField.newMapField(PropMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.propMap_.isMutable()) {
                    this.propMap_ = this.propMap_.copy();
                }
                return this.propMap_;
            }
            
            @Override
            public int getPropMapCount() {
                return this.internalGetPropMap().getMap().size();
            }
            
            @Override
            public boolean containsPropMap(final int key) {
                return this.internalGetPropMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getPropMap() {
                return this.getPropMapMap();
            }
            
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getPropMapMap() {
                return this.internalGetPropMap().getMap();
            }
            
            @Override
            public PropValueOuterClass.PropValue getPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public PropValueOuterClass.PropValue getPropMapOrThrow(final int key) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetPropMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearPropMap() {
                this.internalGetMutablePropMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removePropMap(final int key) {
                this.internalGetMutablePropMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, PropValueOuterClass.PropValue> getMutablePropMap() {
                return this.internalGetMutablePropMap().getMutableMap();
            }
            
            public Builder putPropMap(final int key, final PropValueOuterClass.PropValue value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutablePropMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllPropMap(final Map<Integer, PropValueOuterClass.PropValue> values) {
                this.internalGetMutablePropMap().getMutableMap().putAll(values);
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
    
    public interface PlayerDataNotifyOrBuilder extends MessageOrBuilder
    {
        long getServerTime();
        
        String getNickName();
        
        ByteString getNickNameBytes();
        
        boolean getIsFirstLoginToday();
        
        int getRegionId();
        
        int getPropMapCount();
        
        boolean containsPropMap(final int p0);
        
        @Deprecated
        Map<Integer, PropValueOuterClass.PropValue> getPropMap();
        
        Map<Integer, PropValueOuterClass.PropValue> getPropMapMap();
        
        PropValueOuterClass.PropValue getPropMapOrDefault(final int p0, final PropValueOuterClass.PropValue p1);
        
        PropValueOuterClass.PropValue getPropMapOrThrow(final int p0);
    }
}
