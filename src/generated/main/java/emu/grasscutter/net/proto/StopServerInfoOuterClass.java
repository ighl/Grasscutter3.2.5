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

public final class StopServerInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_StopServerInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StopServerInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private StopServerInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StopServerInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014StopServerInfo.proto\"b\n\u000eStopServerInfo\u0012\u0017\n\u000fstop_begin_time\u0018\u0001 \u0001(\r\u0012\u0015\n\rstop_end_time\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003url\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bcontent_msg\u0018\u0004 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StopServerInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_StopServerInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_StopServerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor, new String[] { "StopBeginTime", "StopEndTime", "Url", "ContentMsg" });
    }
    
    public static final class StopServerInfo extends GeneratedMessageV3 implements StopServerInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STOP_BEGIN_TIME_FIELD_NUMBER = 1;
        private int stopBeginTime_;
        public static final int STOP_END_TIME_FIELD_NUMBER = 2;
        private int stopEndTime_;
        public static final int URL_FIELD_NUMBER = 3;
        private volatile Object url_;
        public static final int CONTENT_MSG_FIELD_NUMBER = 4;
        private volatile Object contentMsg_;
        private byte memoizedIsInitialized;
        private static final StopServerInfo DEFAULT_INSTANCE;
        private static final Parser<StopServerInfo> PARSER;
        
        private StopServerInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private StopServerInfo() {
            this.memoizedIsInitialized = -1;
            this.url_ = "";
            this.contentMsg_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new StopServerInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private StopServerInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.stopBeginTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.stopEndTime_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.url_ = s;
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.contentMsg_ = s;
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
            return StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StopServerInfoOuterClass.internal_static_StopServerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StopServerInfo.class, Builder.class);
        }
        
        @Override
        public int getStopBeginTime() {
            return this.stopBeginTime_;
        }
        
        @Override
        public int getStopEndTime() {
            return this.stopEndTime_;
        }
        
        @Override
        public String getUrl() {
            final Object ref = this.url_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.url_ = s);
        }
        
        @Override
        public ByteString getUrlBytes() {
            final Object ref = this.url_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.url_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getContentMsg() {
            final Object ref = this.contentMsg_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.contentMsg_ = s);
        }
        
        @Override
        public ByteString getContentMsgBytes() {
            final Object ref = this.contentMsg_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.contentMsg_ = b);
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
            if (this.stopBeginTime_ != 0) {
                output.writeUInt32(1, this.stopBeginTime_);
            }
            if (this.stopEndTime_ != 0) {
                output.writeUInt32(2, this.stopEndTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
                GeneratedMessageV3.writeString(output, 3, this.url_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.contentMsg_)) {
                GeneratedMessageV3.writeString(output, 4, this.contentMsg_);
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
            if (this.stopBeginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.stopBeginTime_);
            }
            if (this.stopEndTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.stopEndTime_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.url_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.contentMsg_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.contentMsg_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopServerInfo)) {
                return super.equals(obj);
            }
            final StopServerInfo other = (StopServerInfo)obj;
            return this.getStopBeginTime() == other.getStopBeginTime() && this.getStopEndTime() == other.getStopEndTime() && this.getUrl().equals(other.getUrl()) && this.getContentMsg().equals(other.getContentMsg()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getStopBeginTime();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getStopEndTime();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getUrl().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getContentMsg().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static StopServerInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data);
        }
        
        public static StopServerInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StopServerInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data);
        }
        
        public static StopServerInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StopServerInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data);
        }
        
        public static StopServerInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StopServerInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StopServerInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StopServerInfo.PARSER, input);
        }
        
        public static StopServerInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StopServerInfo.PARSER, input, extensionRegistry);
        }
        
        public static StopServerInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StopServerInfo.PARSER, input);
        }
        
        public static StopServerInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StopServerInfo.PARSER, input, extensionRegistry);
        }
        
        public static StopServerInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StopServerInfo.PARSER, input);
        }
        
        public static StopServerInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StopServerInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return StopServerInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final StopServerInfo prototype) {
            return StopServerInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == StopServerInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static StopServerInfo getDefaultInstance() {
            return StopServerInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<StopServerInfo> parser() {
            return StopServerInfo.PARSER;
        }
        
        @Override
        public Parser<StopServerInfo> getParserForType() {
            return StopServerInfo.PARSER;
        }
        
        @Override
        public StopServerInfo getDefaultInstanceForType() {
            return StopServerInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new StopServerInfo();
            PARSER = new AbstractParser<StopServerInfo>() {
                @Override
                public StopServerInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new StopServerInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopServerInfoOrBuilder
        {
            private int stopBeginTime_;
            private int stopEndTime_;
            private Object url_;
            private Object contentMsg_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return StopServerInfoOuterClass.internal_static_StopServerInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StopServerInfo.class, Builder.class);
            }
            
            private Builder() {
                this.url_ = "";
                this.contentMsg_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.url_ = "";
                this.contentMsg_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (StopServerInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.stopBeginTime_ = 0;
                this.stopEndTime_ = 0;
                this.url_ = "";
                this.contentMsg_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return StopServerInfoOuterClass.internal_static_StopServerInfo_descriptor;
            }
            
            @Override
            public StopServerInfo getDefaultInstanceForType() {
                return StopServerInfo.getDefaultInstance();
            }
            
            @Override
            public StopServerInfo build() {
                final StopServerInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public StopServerInfo buildPartial() {
                final StopServerInfo result = new StopServerInfo(this);
                result.stopBeginTime_ = this.stopBeginTime_;
                result.stopEndTime_ = this.stopEndTime_;
                result.url_ = this.url_;
                result.contentMsg_ = this.contentMsg_;
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
                if (other instanceof StopServerInfo) {
                    return this.mergeFrom((StopServerInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final StopServerInfo other) {
                if (other == StopServerInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getStopBeginTime() != 0) {
                    this.setStopBeginTime(other.getStopBeginTime());
                }
                if (other.getStopEndTime() != 0) {
                    this.setStopEndTime(other.getStopEndTime());
                }
                if (!other.getUrl().isEmpty()) {
                    this.url_ = other.url_;
                    this.onChanged();
                }
                if (!other.getContentMsg().isEmpty()) {
                    this.contentMsg_ = other.contentMsg_;
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
                StopServerInfo parsedMessage = null;
                try {
                    parsedMessage = StopServerInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (StopServerInfo)e.getUnfinishedMessage();
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
            public int getStopBeginTime() {
                return this.stopBeginTime_;
            }
            
            public Builder setStopBeginTime(final int value) {
                this.stopBeginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStopBeginTime() {
                this.stopBeginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStopEndTime() {
                return this.stopEndTime_;
            }
            
            public Builder setStopEndTime(final int value) {
                this.stopEndTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStopEndTime() {
                this.stopEndTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getUrl() {
                final Object ref = this.url_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.url_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getUrlBytes() {
                final Object ref = this.url_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.url_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.url_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUrl() {
                this.url_ = StopServerInfo.getDefaultInstance().getUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.url_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getContentMsg() {
                final Object ref = this.contentMsg_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.contentMsg_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getContentMsgBytes() {
                final Object ref = this.contentMsg_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.contentMsg_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setContentMsg(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.contentMsg_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearContentMsg() {
                this.contentMsg_ = StopServerInfo.getDefaultInstance().getContentMsg();
                this.onChanged();
                return this;
            }
            
            public Builder setContentMsgBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.contentMsg_ = value;
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
    
    public interface StopServerInfoOrBuilder extends MessageOrBuilder
    {
        int getStopBeginTime();
        
        int getStopEndTime();
        
        String getUrl();
        
        ByteString getUrlBytes();
        
        String getContentMsg();
        
        ByteString getContentMsgBytes();
    }
}
