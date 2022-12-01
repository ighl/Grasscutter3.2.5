// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TrackingIOInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_TrackingIOInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TrackingIOInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TrackingIOInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TrackingIOInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014TrackingIOInfo.proto\"\u0092\u0001\n\u000eTrackingIOInfo\u0012\u0014\n\frydevicetype\u0018\u000b \u0001(\t\u0012\u000b\n\u0003mac\u0018\u0006 \u0001(\t\u0012\u0010\n\bdeviceid\u0018\t \u0001(\t\u0012\u0011\n\tclient_tz\u0018\u0005 \u0001(\t\u0012\u0014\n\fcurrent_caid\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bcached_caid\u0018\u000f \u0001(\t\u0012\r\n\u0005appid\u0018\u0001 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TrackingIOInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TrackingIOInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TrackingIOInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_descriptor, new String[] { "Rydevicetype", "Mac", "Deviceid", "ClientTz", "CurrentCaid", "CachedCaid", "Appid" });
    }
    
    public static final class TrackingIOInfo extends GeneratedMessageV3 implements TrackingIOInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RYDEVICETYPE_FIELD_NUMBER = 11;
        private volatile Object rydevicetype_;
        public static final int MAC_FIELD_NUMBER = 6;
        private volatile Object mac_;
        public static final int DEVICEID_FIELD_NUMBER = 9;
        private volatile Object deviceid_;
        public static final int CLIENT_TZ_FIELD_NUMBER = 5;
        private volatile Object clientTz_;
        public static final int CURRENT_CAID_FIELD_NUMBER = 7;
        private volatile Object currentCaid_;
        public static final int CACHED_CAID_FIELD_NUMBER = 15;
        private volatile Object cachedCaid_;
        public static final int APPID_FIELD_NUMBER = 1;
        private volatile Object appid_;
        private byte memoizedIsInitialized;
        private static final TrackingIOInfo DEFAULT_INSTANCE;
        private static final Parser<TrackingIOInfo> PARSER;
        
        private TrackingIOInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TrackingIOInfo() {
            this.memoizedIsInitialized = -1;
            this.rydevicetype_ = "";
            this.mac_ = "";
            this.deviceid_ = "";
            this.clientTz_ = "";
            this.currentCaid_ = "";
            this.cachedCaid_ = "";
            this.appid_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TrackingIOInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TrackingIOInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.appid_ = s;
                            continue;
                        }
                        case 42: {
                            final String s = input.readStringRequireUtf8();
                            this.clientTz_ = s;
                            continue;
                        }
                        case 50: {
                            final String s = input.readStringRequireUtf8();
                            this.mac_ = s;
                            continue;
                        }
                        case 58: {
                            final String s = input.readStringRequireUtf8();
                            this.currentCaid_ = s;
                            continue;
                        }
                        case 74: {
                            final String s = input.readStringRequireUtf8();
                            this.deviceid_ = s;
                            continue;
                        }
                        case 90: {
                            final String s = input.readStringRequireUtf8();
                            this.rydevicetype_ = s;
                            continue;
                        }
                        case 122: {
                            final String s = input.readStringRequireUtf8();
                            this.cachedCaid_ = s;
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
            return TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingIOInfo.class, Builder.class);
        }
        
        @Override
        public String getRydevicetype() {
            final Object ref = this.rydevicetype_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.rydevicetype_ = s);
        }
        
        @Override
        public ByteString getRydevicetypeBytes() {
            final Object ref = this.rydevicetype_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.rydevicetype_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getMac() {
            final Object ref = this.mac_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.mac_ = s);
        }
        
        @Override
        public ByteString getMacBytes() {
            final Object ref = this.mac_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.mac_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getDeviceid() {
            final Object ref = this.deviceid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.deviceid_ = s);
        }
        
        @Override
        public ByteString getDeviceidBytes() {
            final Object ref = this.deviceid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.deviceid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getClientTz() {
            final Object ref = this.clientTz_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.clientTz_ = s);
        }
        
        @Override
        public ByteString getClientTzBytes() {
            final Object ref = this.clientTz_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.clientTz_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getCurrentCaid() {
            final Object ref = this.currentCaid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.currentCaid_ = s);
        }
        
        @Override
        public ByteString getCurrentCaidBytes() {
            final Object ref = this.currentCaid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.currentCaid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getCachedCaid() {
            final Object ref = this.cachedCaid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.cachedCaid_ = s);
        }
        
        @Override
        public ByteString getCachedCaidBytes() {
            final Object ref = this.cachedCaid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.cachedCaid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAppid() {
            final Object ref = this.appid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.appid_ = s);
        }
        
        @Override
        public ByteString getAppidBytes() {
            final Object ref = this.appid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.appid_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.appid_)) {
                GeneratedMessageV3.writeString(output, 1, this.appid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientTz_)) {
                GeneratedMessageV3.writeString(output, 5, this.clientTz_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.mac_)) {
                GeneratedMessageV3.writeString(output, 6, this.mac_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.currentCaid_)) {
                GeneratedMessageV3.writeString(output, 7, this.currentCaid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.deviceid_)) {
                GeneratedMessageV3.writeString(output, 9, this.deviceid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.rydevicetype_)) {
                GeneratedMessageV3.writeString(output, 11, this.rydevicetype_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.cachedCaid_)) {
                GeneratedMessageV3.writeString(output, 15, this.cachedCaid_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.appid_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.appid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.clientTz_)) {
                size += GeneratedMessageV3.computeStringSize(5, this.clientTz_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.mac_)) {
                size += GeneratedMessageV3.computeStringSize(6, this.mac_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.currentCaid_)) {
                size += GeneratedMessageV3.computeStringSize(7, this.currentCaid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.deviceid_)) {
                size += GeneratedMessageV3.computeStringSize(9, this.deviceid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.rydevicetype_)) {
                size += GeneratedMessageV3.computeStringSize(11, this.rydevicetype_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.cachedCaid_)) {
                size += GeneratedMessageV3.computeStringSize(15, this.cachedCaid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrackingIOInfo)) {
                return super.equals(obj);
            }
            final TrackingIOInfo other = (TrackingIOInfo)obj;
            return this.getRydevicetype().equals(other.getRydevicetype()) && this.getMac().equals(other.getMac()) && this.getDeviceid().equals(other.getDeviceid()) && this.getClientTz().equals(other.getClientTz()) && this.getCurrentCaid().equals(other.getCurrentCaid()) && this.getCachedCaid().equals(other.getCachedCaid()) && this.getAppid().equals(other.getAppid()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRydevicetype().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getMac().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getDeviceid().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getClientTz().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getCurrentCaid().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getCachedCaid().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getAppid().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TrackingIOInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data);
        }
        
        public static TrackingIOInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrackingIOInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data);
        }
        
        public static TrackingIOInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrackingIOInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data);
        }
        
        public static TrackingIOInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrackingIOInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrackingIOInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrackingIOInfo.PARSER, input);
        }
        
        public static TrackingIOInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrackingIOInfo.PARSER, input, extensionRegistry);
        }
        
        public static TrackingIOInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrackingIOInfo.PARSER, input);
        }
        
        public static TrackingIOInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrackingIOInfo.PARSER, input, extensionRegistry);
        }
        
        public static TrackingIOInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrackingIOInfo.PARSER, input);
        }
        
        public static TrackingIOInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrackingIOInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TrackingIOInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TrackingIOInfo prototype) {
            return TrackingIOInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TrackingIOInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TrackingIOInfo getDefaultInstance() {
            return TrackingIOInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<TrackingIOInfo> parser() {
            return TrackingIOInfo.PARSER;
        }
        
        @Override
        public Parser<TrackingIOInfo> getParserForType() {
            return TrackingIOInfo.PARSER;
        }
        
        @Override
        public TrackingIOInfo getDefaultInstanceForType() {
            return TrackingIOInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TrackingIOInfo();
            PARSER = new AbstractParser<TrackingIOInfo>() {
                @Override
                public TrackingIOInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TrackingIOInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrackingIOInfoOrBuilder
        {
            private Object rydevicetype_;
            private Object mac_;
            private Object deviceid_;
            private Object clientTz_;
            private Object currentCaid_;
            private Object cachedCaid_;
            private Object appid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrackingIOInfo.class, Builder.class);
            }
            
            private Builder() {
                this.rydevicetype_ = "";
                this.mac_ = "";
                this.deviceid_ = "";
                this.clientTz_ = "";
                this.currentCaid_ = "";
                this.cachedCaid_ = "";
                this.appid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.rydevicetype_ = "";
                this.mac_ = "";
                this.deviceid_ = "";
                this.clientTz_ = "";
                this.currentCaid_ = "";
                this.cachedCaid_ = "";
                this.appid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TrackingIOInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.rydevicetype_ = "";
                this.mac_ = "";
                this.deviceid_ = "";
                this.clientTz_ = "";
                this.currentCaid_ = "";
                this.cachedCaid_ = "";
                this.appid_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TrackingIOInfoOuterClass.internal_static_TrackingIOInfo_descriptor;
            }
            
            @Override
            public TrackingIOInfo getDefaultInstanceForType() {
                return TrackingIOInfo.getDefaultInstance();
            }
            
            @Override
            public TrackingIOInfo build() {
                final TrackingIOInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TrackingIOInfo buildPartial() {
                final TrackingIOInfo result = new TrackingIOInfo(this);
                result.rydevicetype_ = this.rydevicetype_;
                result.mac_ = this.mac_;
                result.deviceid_ = this.deviceid_;
                result.clientTz_ = this.clientTz_;
                result.currentCaid_ = this.currentCaid_;
                result.cachedCaid_ = this.cachedCaid_;
                result.appid_ = this.appid_;
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
                if (other instanceof TrackingIOInfo) {
                    return this.mergeFrom((TrackingIOInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TrackingIOInfo other) {
                if (other == TrackingIOInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.getRydevicetype().isEmpty()) {
                    this.rydevicetype_ = other.rydevicetype_;
                    this.onChanged();
                }
                if (!other.getMac().isEmpty()) {
                    this.mac_ = other.mac_;
                    this.onChanged();
                }
                if (!other.getDeviceid().isEmpty()) {
                    this.deviceid_ = other.deviceid_;
                    this.onChanged();
                }
                if (!other.getClientTz().isEmpty()) {
                    this.clientTz_ = other.clientTz_;
                    this.onChanged();
                }
                if (!other.getCurrentCaid().isEmpty()) {
                    this.currentCaid_ = other.currentCaid_;
                    this.onChanged();
                }
                if (!other.getCachedCaid().isEmpty()) {
                    this.cachedCaid_ = other.cachedCaid_;
                    this.onChanged();
                }
                if (!other.getAppid().isEmpty()) {
                    this.appid_ = other.appid_;
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
                TrackingIOInfo parsedMessage = null;
                try {
                    parsedMessage = TrackingIOInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TrackingIOInfo)e.getUnfinishedMessage();
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
            public String getRydevicetype() {
                final Object ref = this.rydevicetype_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.rydevicetype_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getRydevicetypeBytes() {
                final Object ref = this.rydevicetype_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.rydevicetype_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setRydevicetype(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.rydevicetype_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRydevicetype() {
                this.rydevicetype_ = TrackingIOInfo.getDefaultInstance().getRydevicetype();
                this.onChanged();
                return this;
            }
            
            public Builder setRydevicetypeBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.rydevicetype_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getMac() {
                final Object ref = this.mac_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.mac_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getMacBytes() {
                final Object ref = this.mac_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.mac_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setMac(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.mac_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMac() {
                this.mac_ = TrackingIOInfo.getDefaultInstance().getMac();
                this.onChanged();
                return this;
            }
            
            public Builder setMacBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.mac_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getDeviceid() {
                final Object ref = this.deviceid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.deviceid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getDeviceidBytes() {
                final Object ref = this.deviceid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.deviceid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setDeviceid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.deviceid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDeviceid() {
                this.deviceid_ = TrackingIOInfo.getDefaultInstance().getDeviceid();
                this.onChanged();
                return this;
            }
            
            public Builder setDeviceidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.deviceid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getClientTz() {
                final Object ref = this.clientTz_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.clientTz_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getClientTzBytes() {
                final Object ref = this.clientTz_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.clientTz_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setClientTz(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientTz_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientTz() {
                this.clientTz_ = TrackingIOInfo.getDefaultInstance().getClientTz();
                this.onChanged();
                return this;
            }
            
            public Builder setClientTzBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.clientTz_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCurrentCaid() {
                final Object ref = this.currentCaid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.currentCaid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCurrentCaidBytes() {
                final Object ref = this.currentCaid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.currentCaid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCurrentCaid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.currentCaid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurrentCaid() {
                this.currentCaid_ = TrackingIOInfo.getDefaultInstance().getCurrentCaid();
                this.onChanged();
                return this;
            }
            
            public Builder setCurrentCaidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.currentCaid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getCachedCaid() {
                final Object ref = this.cachedCaid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.cachedCaid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getCachedCaidBytes() {
                final Object ref = this.cachedCaid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.cachedCaid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setCachedCaid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.cachedCaid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCachedCaid() {
                this.cachedCaid_ = TrackingIOInfo.getDefaultInstance().getCachedCaid();
                this.onChanged();
                return this;
            }
            
            public Builder setCachedCaidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.cachedCaid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAppid() {
                final Object ref = this.appid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.appid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAppidBytes() {
                final Object ref = this.appid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.appid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAppid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.appid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAppid() {
                this.appid_ = TrackingIOInfo.getDefaultInstance().getAppid();
                this.onChanged();
                return this;
            }
            
            public Builder setAppidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.appid_ = value;
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
    
    public interface TrackingIOInfoOrBuilder extends MessageOrBuilder
    {
        String getRydevicetype();
        
        ByteString getRydevicetypeBytes();
        
        String getMac();
        
        ByteString getMacBytes();
        
        String getDeviceid();
        
        ByteString getDeviceidBytes();
        
        String getClientTz();
        
        ByteString getClientTzBytes();
        
        String getCurrentCaid();
        
        ByteString getCurrentCaidBytes();
        
        String getCachedCaid();
        
        ByteString getCachedCaidBytes();
        
        String getAppid();
        
        ByteString getAppidBytes();
    }
}
