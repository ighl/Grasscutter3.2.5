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

public final class RegionSimpleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_RegionSimpleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_RegionSimpleInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private RegionSimpleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return RegionSimpleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016RegionSimpleInfo.proto\"S\n\u0010RegionSimpleInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\f\n\u0004type\u0018\u0003 \u0001(\t\u0012\u0014\n\fdispatch_url\u0018\u0004 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        RegionSimpleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_RegionSimpleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_RegionSimpleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor, new String[] { "Name", "Title", "Type", "DispatchUrl" });
    }
    
    public static final class RegionSimpleInfo extends GeneratedMessageV3 implements RegionSimpleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        public static final int TITLE_FIELD_NUMBER = 2;
        private volatile Object title_;
        public static final int TYPE_FIELD_NUMBER = 3;
        private volatile Object type_;
        public static final int DISPATCH_URL_FIELD_NUMBER = 4;
        private volatile Object dispatchUrl_;
        private byte memoizedIsInitialized;
        private static final RegionSimpleInfo DEFAULT_INSTANCE;
        private static final Parser<RegionSimpleInfo> PARSER;
        
        private RegionSimpleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private RegionSimpleInfo() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.title_ = "";
            this.type_ = "";
            this.dispatchUrl_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new RegionSimpleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private RegionSimpleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.name_ = s;
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.title_ = s;
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.type_ = s;
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.dispatchUrl_ = s;
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
            return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionSimpleInfo.class, Builder.class);
        }
        
        @Override
        public String getName() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.name_ = s);
        }
        
        @Override
        public ByteString getNameBytes() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.name_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getTitle() {
            final Object ref = this.title_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.title_ = s);
        }
        
        @Override
        public ByteString getTitleBytes() {
            final Object ref = this.title_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.title_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getType() {
            final Object ref = this.type_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.type_ = s);
        }
        
        @Override
        public ByteString getTypeBytes() {
            final Object ref = this.type_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.type_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getDispatchUrl() {
            final Object ref = this.dispatchUrl_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.dispatchUrl_ = s);
        }
        
        @Override
        public ByteString getDispatchUrlBytes() {
            final Object ref = this.dispatchUrl_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.dispatchUrl_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                GeneratedMessageV3.writeString(output, 2, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
                GeneratedMessageV3.writeString(output, 3, this.type_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dispatchUrl_)) {
                GeneratedMessageV3.writeString(output, 4, this.dispatchUrl_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.type_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dispatchUrl_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.dispatchUrl_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RegionSimpleInfo)) {
                return super.equals(obj);
            }
            final RegionSimpleInfo other = (RegionSimpleInfo)obj;
            return this.getName().equals(other.getName()) && this.getTitle().equals(other.getTitle()) && this.getType().equals(other.getType()) && this.getDispatchUrl().equals(other.getDispatchUrl()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getName().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getTitle().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getType().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getDispatchUrl().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static RegionSimpleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data);
        }
        
        public static RegionSimpleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionSimpleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data);
        }
        
        public static RegionSimpleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionSimpleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data);
        }
        
        public static RegionSimpleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return RegionSimpleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static RegionSimpleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionSimpleInfo.PARSER, input);
        }
        
        public static RegionSimpleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionSimpleInfo.PARSER, input, extensionRegistry);
        }
        
        public static RegionSimpleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RegionSimpleInfo.PARSER, input);
        }
        
        public static RegionSimpleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(RegionSimpleInfo.PARSER, input, extensionRegistry);
        }
        
        public static RegionSimpleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionSimpleInfo.PARSER, input);
        }
        
        public static RegionSimpleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(RegionSimpleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return RegionSimpleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final RegionSimpleInfo prototype) {
            return RegionSimpleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == RegionSimpleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static RegionSimpleInfo getDefaultInstance() {
            return RegionSimpleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<RegionSimpleInfo> parser() {
            return RegionSimpleInfo.PARSER;
        }
        
        @Override
        public Parser<RegionSimpleInfo> getParserForType() {
            return RegionSimpleInfo.PARSER;
        }
        
        @Override
        public RegionSimpleInfo getDefaultInstanceForType() {
            return RegionSimpleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new RegionSimpleInfo();
            PARSER = new AbstractParser<RegionSimpleInfo>() {
                @Override
                public RegionSimpleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new RegionSimpleInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RegionSimpleInfoOrBuilder
        {
            private Object name_;
            private Object title_;
            private Object type_;
            private Object dispatchUrl_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RegionSimpleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.name_ = "";
                this.title_ = "";
                this.type_ = "";
                this.dispatchUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.title_ = "";
                this.type_ = "";
                this.dispatchUrl_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (RegionSimpleInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.title_ = "";
                this.type_ = "";
                this.dispatchUrl_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
            }
            
            @Override
            public RegionSimpleInfo getDefaultInstanceForType() {
                return RegionSimpleInfo.getDefaultInstance();
            }
            
            @Override
            public RegionSimpleInfo build() {
                final RegionSimpleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public RegionSimpleInfo buildPartial() {
                final RegionSimpleInfo result = new RegionSimpleInfo(this);
                result.name_ = this.name_;
                result.title_ = this.title_;
                result.type_ = this.type_;
                result.dispatchUrl_ = this.dispatchUrl_;
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
                if (other instanceof RegionSimpleInfo) {
                    return this.mergeFrom((RegionSimpleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final RegionSimpleInfo other) {
                if (other == RegionSimpleInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    this.onChanged();
                }
                if (!other.getTitle().isEmpty()) {
                    this.title_ = other.title_;
                    this.onChanged();
                }
                if (!other.getType().isEmpty()) {
                    this.type_ = other.type_;
                    this.onChanged();
                }
                if (!other.getDispatchUrl().isEmpty()) {
                    this.dispatchUrl_ = other.dispatchUrl_;
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
                RegionSimpleInfo parsedMessage = null;
                try {
                    parsedMessage = RegionSimpleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (RegionSimpleInfo)e.getUnfinishedMessage();
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
            public String getName() {
                final Object ref = this.name_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.name_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNameBytes() {
                final Object ref = this.name_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.name_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearName() {
                this.name_ = RegionSimpleInfo.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }
            
            public Builder setNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getTitle() {
                final Object ref = this.title_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.title_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTitleBytes() {
                final Object ref = this.title_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.title_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setTitle(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.title_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTitle() {
                this.title_ = RegionSimpleInfo.getDefaultInstance().getTitle();
                this.onChanged();
                return this;
            }
            
            public Builder setTitleBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.title_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getType() {
                final Object ref = this.type_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.type_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTypeBytes() {
                final Object ref = this.type_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.type_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setType(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearType() {
                this.type_ = RegionSimpleInfo.getDefaultInstance().getType();
                this.onChanged();
                return this;
            }
            
            public Builder setTypeBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getDispatchUrl() {
                final Object ref = this.dispatchUrl_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.dispatchUrl_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getDispatchUrlBytes() {
                final Object ref = this.dispatchUrl_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.dispatchUrl_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setDispatchUrl(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.dispatchUrl_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDispatchUrl() {
                this.dispatchUrl_ = RegionSimpleInfo.getDefaultInstance().getDispatchUrl();
                this.onChanged();
                return this;
            }
            
            public Builder setDispatchUrlBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.dispatchUrl_ = value;
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
    
    public interface RegionSimpleInfoOrBuilder extends MessageOrBuilder
    {
        String getName();
        
        ByteString getNameBytes();
        
        String getTitle();
        
        ByteString getTitleBytes();
        
        String getType();
        
        ByteString getTypeBytes();
        
        String getDispatchUrl();
        
        ByteString getDispatchUrlBytes();
    }
}
