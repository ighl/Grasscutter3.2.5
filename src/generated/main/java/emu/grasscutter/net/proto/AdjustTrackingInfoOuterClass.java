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

public final class AdjustTrackingInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AdjustTrackingInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AdjustTrackingInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AdjustTrackingInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AdjustTrackingInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018AdjustTrackingInfo.proto\"}\n\u0012AdjustTrackingInfo\u0012\u0013\n\u000bevent_token\u0018\t \u0001(\t\u0012\f\n\u0004adid\u0018\u0004 \u0001(\t\u0012\f\n\u0004idfa\u0018\u0002 \u0001(\t\u0012\u0011\n\tapp_token\u0018\u000e \u0001(\t\u0012\u0010\n\bgps_adid\u0018\u0003 \u0001(\t\u0012\u0011\n\tfire_adid\u0018\r \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AdjustTrackingInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AdjustTrackingInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AdjustTrackingInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_descriptor, new String[] { "EventToken", "Adid", "Idfa", "AppToken", "GpsAdid", "FireAdid" });
    }
    
    public static final class AdjustTrackingInfo extends GeneratedMessageV3 implements AdjustTrackingInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EVENT_TOKEN_FIELD_NUMBER = 9;
        private volatile Object eventToken_;
        public static final int ADID_FIELD_NUMBER = 4;
        private volatile Object adid_;
        public static final int IDFA_FIELD_NUMBER = 2;
        private volatile Object idfa_;
        public static final int APP_TOKEN_FIELD_NUMBER = 14;
        private volatile Object appToken_;
        public static final int GPS_ADID_FIELD_NUMBER = 3;
        private volatile Object gpsAdid_;
        public static final int FIRE_ADID_FIELD_NUMBER = 13;
        private volatile Object fireAdid_;
        private byte memoizedIsInitialized;
        private static final AdjustTrackingInfo DEFAULT_INSTANCE;
        private static final Parser<AdjustTrackingInfo> PARSER;
        
        private AdjustTrackingInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AdjustTrackingInfo() {
            this.memoizedIsInitialized = -1;
            this.eventToken_ = "";
            this.adid_ = "";
            this.idfa_ = "";
            this.appToken_ = "";
            this.gpsAdid_ = "";
            this.fireAdid_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AdjustTrackingInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AdjustTrackingInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.idfa_ = s;
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.gpsAdid_ = s;
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.adid_ = s;
                            continue;
                        }
                        case 74: {
                            final String s = input.readStringRequireUtf8();
                            this.eventToken_ = s;
                            continue;
                        }
                        case 106: {
                            final String s = input.readStringRequireUtf8();
                            this.fireAdid_ = s;
                            continue;
                        }
                        case 114: {
                            final String s = input.readStringRequireUtf8();
                            this.appToken_ = s;
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
            return AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AdjustTrackingInfo.class, Builder.class);
        }
        
        @Override
        public String getEventToken() {
            final Object ref = this.eventToken_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.eventToken_ = s);
        }
        
        @Override
        public ByteString getEventTokenBytes() {
            final Object ref = this.eventToken_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.eventToken_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAdid() {
            final Object ref = this.adid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.adid_ = s);
        }
        
        @Override
        public ByteString getAdidBytes() {
            final Object ref = this.adid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.adid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getIdfa() {
            final Object ref = this.idfa_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.idfa_ = s);
        }
        
        @Override
        public ByteString getIdfaBytes() {
            final Object ref = this.idfa_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.idfa_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getAppToken() {
            final Object ref = this.appToken_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.appToken_ = s);
        }
        
        @Override
        public ByteString getAppTokenBytes() {
            final Object ref = this.appToken_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.appToken_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getGpsAdid() {
            final Object ref = this.gpsAdid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.gpsAdid_ = s);
        }
        
        @Override
        public ByteString getGpsAdidBytes() {
            final Object ref = this.gpsAdid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.gpsAdid_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getFireAdid() {
            final Object ref = this.fireAdid_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.fireAdid_ = s);
        }
        
        @Override
        public ByteString getFireAdidBytes() {
            final Object ref = this.fireAdid_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.fireAdid_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.idfa_)) {
                GeneratedMessageV3.writeString(output, 2, this.idfa_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gpsAdid_)) {
                GeneratedMessageV3.writeString(output, 3, this.gpsAdid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.adid_)) {
                GeneratedMessageV3.writeString(output, 4, this.adid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.eventToken_)) {
                GeneratedMessageV3.writeString(output, 9, this.eventToken_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.fireAdid_)) {
                GeneratedMessageV3.writeString(output, 13, this.fireAdid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.appToken_)) {
                GeneratedMessageV3.writeString(output, 14, this.appToken_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.idfa_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.idfa_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.gpsAdid_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.gpsAdid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.adid_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.adid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.eventToken_)) {
                size += GeneratedMessageV3.computeStringSize(9, this.eventToken_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.fireAdid_)) {
                size += GeneratedMessageV3.computeStringSize(13, this.fireAdid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.appToken_)) {
                size += GeneratedMessageV3.computeStringSize(14, this.appToken_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdjustTrackingInfo)) {
                return super.equals(obj);
            }
            final AdjustTrackingInfo other = (AdjustTrackingInfo)obj;
            return this.getEventToken().equals(other.getEventToken()) && this.getAdid().equals(other.getAdid()) && this.getIdfa().equals(other.getIdfa()) && this.getAppToken().equals(other.getAppToken()) && this.getGpsAdid().equals(other.getGpsAdid()) && this.getFireAdid().equals(other.getFireAdid()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getEventToken().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getAdid().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getIdfa().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getAppToken().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getGpsAdid().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getFireAdid().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AdjustTrackingInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data);
        }
        
        public static AdjustTrackingInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AdjustTrackingInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data);
        }
        
        public static AdjustTrackingInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AdjustTrackingInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data);
        }
        
        public static AdjustTrackingInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AdjustTrackingInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AdjustTrackingInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AdjustTrackingInfo.PARSER, input);
        }
        
        public static AdjustTrackingInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AdjustTrackingInfo.PARSER, input, extensionRegistry);
        }
        
        public static AdjustTrackingInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AdjustTrackingInfo.PARSER, input);
        }
        
        public static AdjustTrackingInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AdjustTrackingInfo.PARSER, input, extensionRegistry);
        }
        
        public static AdjustTrackingInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AdjustTrackingInfo.PARSER, input);
        }
        
        public static AdjustTrackingInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AdjustTrackingInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AdjustTrackingInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AdjustTrackingInfo prototype) {
            return AdjustTrackingInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AdjustTrackingInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AdjustTrackingInfo getDefaultInstance() {
            return AdjustTrackingInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AdjustTrackingInfo> parser() {
            return AdjustTrackingInfo.PARSER;
        }
        
        @Override
        public Parser<AdjustTrackingInfo> getParserForType() {
            return AdjustTrackingInfo.PARSER;
        }
        
        @Override
        public AdjustTrackingInfo getDefaultInstanceForType() {
            return AdjustTrackingInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AdjustTrackingInfo();
            PARSER = new AbstractParser<AdjustTrackingInfo>() {
                @Override
                public AdjustTrackingInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AdjustTrackingInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdjustTrackingInfoOrBuilder
        {
            private Object eventToken_;
            private Object adid_;
            private Object idfa_;
            private Object appToken_;
            private Object gpsAdid_;
            private Object fireAdid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AdjustTrackingInfo.class, Builder.class);
            }
            
            private Builder() {
                this.eventToken_ = "";
                this.adid_ = "";
                this.idfa_ = "";
                this.appToken_ = "";
                this.gpsAdid_ = "";
                this.fireAdid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.eventToken_ = "";
                this.adid_ = "";
                this.idfa_ = "";
                this.appToken_ = "";
                this.gpsAdid_ = "";
                this.fireAdid_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AdjustTrackingInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.eventToken_ = "";
                this.adid_ = "";
                this.idfa_ = "";
                this.appToken_ = "";
                this.gpsAdid_ = "";
                this.fireAdid_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AdjustTrackingInfoOuterClass.internal_static_AdjustTrackingInfo_descriptor;
            }
            
            @Override
            public AdjustTrackingInfo getDefaultInstanceForType() {
                return AdjustTrackingInfo.getDefaultInstance();
            }
            
            @Override
            public AdjustTrackingInfo build() {
                final AdjustTrackingInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AdjustTrackingInfo buildPartial() {
                final AdjustTrackingInfo result = new AdjustTrackingInfo(this);
                result.eventToken_ = this.eventToken_;
                result.adid_ = this.adid_;
                result.idfa_ = this.idfa_;
                result.appToken_ = this.appToken_;
                result.gpsAdid_ = this.gpsAdid_;
                result.fireAdid_ = this.fireAdid_;
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
                if (other instanceof AdjustTrackingInfo) {
                    return this.mergeFrom((AdjustTrackingInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AdjustTrackingInfo other) {
                if (other == AdjustTrackingInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.getEventToken().isEmpty()) {
                    this.eventToken_ = other.eventToken_;
                    this.onChanged();
                }
                if (!other.getAdid().isEmpty()) {
                    this.adid_ = other.adid_;
                    this.onChanged();
                }
                if (!other.getIdfa().isEmpty()) {
                    this.idfa_ = other.idfa_;
                    this.onChanged();
                }
                if (!other.getAppToken().isEmpty()) {
                    this.appToken_ = other.appToken_;
                    this.onChanged();
                }
                if (!other.getGpsAdid().isEmpty()) {
                    this.gpsAdid_ = other.gpsAdid_;
                    this.onChanged();
                }
                if (!other.getFireAdid().isEmpty()) {
                    this.fireAdid_ = other.fireAdid_;
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
                AdjustTrackingInfo parsedMessage = null;
                try {
                    parsedMessage = AdjustTrackingInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AdjustTrackingInfo)e.getUnfinishedMessage();
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
            public String getEventToken() {
                final Object ref = this.eventToken_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.eventToken_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getEventTokenBytes() {
                final Object ref = this.eventToken_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.eventToken_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setEventToken(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.eventToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEventToken() {
                this.eventToken_ = AdjustTrackingInfo.getDefaultInstance().getEventToken();
                this.onChanged();
                return this;
            }
            
            public Builder setEventTokenBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.eventToken_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAdid() {
                final Object ref = this.adid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.adid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAdidBytes() {
                final Object ref = this.adid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.adid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAdid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.adid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAdid() {
                this.adid_ = AdjustTrackingInfo.getDefaultInstance().getAdid();
                this.onChanged();
                return this;
            }
            
            public Builder setAdidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.adid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getIdfa() {
                final Object ref = this.idfa_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.idfa_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getIdfaBytes() {
                final Object ref = this.idfa_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.idfa_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setIdfa(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.idfa_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIdfa() {
                this.idfa_ = AdjustTrackingInfo.getDefaultInstance().getIdfa();
                this.onChanged();
                return this;
            }
            
            public Builder setIdfaBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.idfa_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getAppToken() {
                final Object ref = this.appToken_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.appToken_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getAppTokenBytes() {
                final Object ref = this.appToken_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.appToken_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setAppToken(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.appToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAppToken() {
                this.appToken_ = AdjustTrackingInfo.getDefaultInstance().getAppToken();
                this.onChanged();
                return this;
            }
            
            public Builder setAppTokenBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.appToken_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getGpsAdid() {
                final Object ref = this.gpsAdid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.gpsAdid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getGpsAdidBytes() {
                final Object ref = this.gpsAdid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.gpsAdid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setGpsAdid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.gpsAdid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGpsAdid() {
                this.gpsAdid_ = AdjustTrackingInfo.getDefaultInstance().getGpsAdid();
                this.onChanged();
                return this;
            }
            
            public Builder setGpsAdidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.gpsAdid_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getFireAdid() {
                final Object ref = this.fireAdid_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.fireAdid_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getFireAdidBytes() {
                final Object ref = this.fireAdid_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.fireAdid_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setFireAdid(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.fireAdid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFireAdid() {
                this.fireAdid_ = AdjustTrackingInfo.getDefaultInstance().getFireAdid();
                this.onChanged();
                return this;
            }
            
            public Builder setFireAdidBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.fireAdid_ = value;
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
    
    public interface AdjustTrackingInfoOrBuilder extends MessageOrBuilder
    {
        String getEventToken();
        
        ByteString getEventTokenBytes();
        
        String getAdid();
        
        ByteString getAdidBytes();
        
        String getIdfa();
        
        ByteString getIdfaBytes();
        
        String getAppToken();
        
        ByteString getAppTokenBytes();
        
        String getGpsAdid();
        
        ByteString getGpsAdidBytes();
        
        String getFireAdid();
        
        ByteString getFireAdidBytes();
    }
}
