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

public final class ForceUpdateInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForceUpdateInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForceUpdateInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForceUpdateInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForceUpdateInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015ForceUpdateInfo.proto\"+\n\u000fForceUpdateInfo\u0012\u0018\n\u0010force_update_url\u0018\u0001 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForceUpdateInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ForceUpdateInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForceUpdateInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor, new String[] { "ForceUpdateUrl" });
    }
    
    public static final class ForceUpdateInfo extends GeneratedMessageV3 implements ForceUpdateInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORCE_UPDATE_URL_FIELD_NUMBER = 1;
        private volatile Object forceUpdateUrl_;
        private byte memoizedIsInitialized;
        private static final ForceUpdateInfo DEFAULT_INSTANCE;
        private static final Parser<ForceUpdateInfo> PARSER;
        
        private ForceUpdateInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ForceUpdateInfo() {
            this.memoizedIsInitialized = -1;
            this.forceUpdateUrl_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForceUpdateInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForceUpdateInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.forceUpdateUrl_ = s;
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
            return ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ForceUpdateInfo.class, Builder.class);
        }
        
        @Override
        public String getForceUpdateUrl() {
            final Object ref = this.forceUpdateUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.forceUpdateUrl_ = s);
        }
        
        @Override
        public ByteString getForceUpdateUrlBytes() {
            final Object ref = this.forceUpdateUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.forceUpdateUrl_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.forceUpdateUrl_)) {
                GeneratedMessageV3.writeString(output, 1, this.forceUpdateUrl_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.forceUpdateUrl_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.forceUpdateUrl_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForceUpdateInfo)) {
                return super.equals(obj);
            }
            final ForceUpdateInfo other = (ForceUpdateInfo)obj;
            return this.getForceUpdateUrl().equals(other.getForceUpdateUrl()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getForceUpdateUrl().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForceUpdateInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data);
        }
        
        public static ForceUpdateInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForceUpdateInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data);
        }
        
        public static ForceUpdateInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForceUpdateInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data);
        }
        
        public static ForceUpdateInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForceUpdateInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForceUpdateInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForceUpdateInfo.PARSER, input);
        }
        
        public static ForceUpdateInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForceUpdateInfo.PARSER, input, extensionRegistry);
        }
        
        public static ForceUpdateInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForceUpdateInfo.PARSER, input);
        }
        
        public static ForceUpdateInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForceUpdateInfo.PARSER, input, extensionRegistry);
        }
        
        public static ForceUpdateInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForceUpdateInfo.PARSER, input);
        }
        
        public static ForceUpdateInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForceUpdateInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForceUpdateInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForceUpdateInfo prototype) {
            return ForceUpdateInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForceUpdateInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForceUpdateInfo getDefaultInstance() {
            return ForceUpdateInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForceUpdateInfo> parser() {
            return ForceUpdateInfo.PARSER;
        }
        
        @Override
        public Parser<ForceUpdateInfo> getParserForType() {
            return ForceUpdateInfo.PARSER;
        }
        
        @Override
        public ForceUpdateInfo getDefaultInstanceForType() {
            return ForceUpdateInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForceUpdateInfo();
            PARSER = new AbstractParser<ForceUpdateInfo>() {
                @Override
                public ForceUpdateInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForceUpdateInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForceUpdateInfoOrBuilder
        {
            private Object forceUpdateUrl_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ForceUpdateInfo.class, Builder.class);
            }
            
            private Builder() {
                this.forceUpdateUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.forceUpdateUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForceUpdateInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.forceUpdateUrl_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForceUpdateInfoOuterClass.internal_static_ForceUpdateInfo_descriptor;
            }
            
            @Override
            public ForceUpdateInfo getDefaultInstanceForType() {
                return ForceUpdateInfo.getDefaultInstance();
            }
            
            @Override
            public ForceUpdateInfo build() {
                final ForceUpdateInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForceUpdateInfo buildPartial() {
                final ForceUpdateInfo result = new ForceUpdateInfo(this);
                result.forceUpdateUrl_ = this.forceUpdateUrl_;
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
                if (other instanceof ForceUpdateInfo) {
                    return this.mergeFrom((ForceUpdateInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForceUpdateInfo other) {
                if (other == ForceUpdateInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.getForceUpdateUrl().isEmpty()) {
                    this.forceUpdateUrl_ = other.forceUpdateUrl_;
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
                ForceUpdateInfo parsedMessage = null;
                try {
                    parsedMessage = ForceUpdateInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForceUpdateInfo)e.getUnfinishedMessage();
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
            public String getForceUpdateUrl() {
                final Object ref = this.forceUpdateUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.forceUpdateUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getForceUpdateUrlBytes() {
                final Object ref = this.forceUpdateUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.forceUpdateUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setForceUpdateUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.forceUpdateUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearForceUpdateUrl() {
                this.forceUpdateUrl_ = ForceUpdateInfo.getDefaultInstance().getForceUpdateUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setForceUpdateUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.forceUpdateUrl_ = value;
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
    
    public interface ForceUpdateInfoOrBuilder extends MessageOrBuilder
    {
        String getForceUpdateUrl();
        
        ByteString getForceUpdateUrlBytes();
    }
}
