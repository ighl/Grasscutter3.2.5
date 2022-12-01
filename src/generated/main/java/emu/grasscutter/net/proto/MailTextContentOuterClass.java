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

public final class MailTextContentOuterClass
{
    private static final Descriptors.Descriptor internal_static_MailTextContent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MailTextContent_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MailTextContentOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MailTextContentOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015MailTextContent.proto\"A\n\u000fMailTextContent\u0012\r\n\u0005title\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007content\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006sender\u0018\u0003 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MailTextContentOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MailTextContent_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MailTextContent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MailTextContentOuterClass.internal_static_MailTextContent_descriptor, new String[] { "Title", "Content", "Sender" });
    }
    
    public static final class MailTextContent extends GeneratedMessageV3 implements MailTextContentOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TITLE_FIELD_NUMBER = 1;
        private volatile Object title_;
        public static final int CONTENT_FIELD_NUMBER = 2;
        private volatile Object content_;
        public static final int SENDER_FIELD_NUMBER = 3;
        private volatile Object sender_;
        private byte memoizedIsInitialized;
        private static final MailTextContent DEFAULT_INSTANCE;
        private static final Parser<MailTextContent> PARSER;
        
        private MailTextContent(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MailTextContent() {
            this.memoizedIsInitialized = -1;
            this.title_ = "";
            this.content_ = "";
            this.sender_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MailTextContent();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MailTextContent(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.title_ = s;
                            continue;
                        }
                        case 18: {
                            final String s = input.readStringRequireUtf8();
                            this.content_ = s;
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.sender_ = s;
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
            return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MailTextContentOuterClass.internal_static_MailTextContent_fieldAccessorTable.ensureFieldAccessorsInitialized(MailTextContent.class, Builder.class);
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
        public String getContent() {
            final Object ref = this.content_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.content_ = s);
        }
        
        @Override
        public ByteString getContentBytes() {
            final Object ref = this.content_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.content_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public String getSender() {
            final Object ref = this.sender_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.sender_ = s);
        }
        
        @Override
        public ByteString getSenderBytes() {
            final Object ref = this.sender_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.sender_ = b);
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
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                GeneratedMessageV3.writeString(output, 1, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                GeneratedMessageV3.writeString(output, 2, this.content_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.sender_)) {
                GeneratedMessageV3.writeString(output, 3, this.sender_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.content_)) {
                size += GeneratedMessageV3.computeStringSize(2, this.content_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.sender_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.sender_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MailTextContent)) {
                return super.equals(obj);
            }
            final MailTextContent other = (MailTextContent)obj;
            return this.getTitle().equals(other.getTitle()) && this.getContent().equals(other.getContent()) && this.getSender().equals(other.getSender()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getTitle().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getContent().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSender().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MailTextContent parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data);
        }
        
        public static MailTextContent parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailTextContent parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data);
        }
        
        public static MailTextContent parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailTextContent parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data);
        }
        
        public static MailTextContent parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailTextContent.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailTextContent parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailTextContent.PARSER, input);
        }
        
        public static MailTextContent parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailTextContent.PARSER, input, extensionRegistry);
        }
        
        public static MailTextContent parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailTextContent.PARSER, input);
        }
        
        public static MailTextContent parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailTextContent.PARSER, input, extensionRegistry);
        }
        
        public static MailTextContent parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailTextContent.PARSER, input);
        }
        
        public static MailTextContent parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailTextContent.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MailTextContent.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MailTextContent prototype) {
            return MailTextContent.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MailTextContent.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MailTextContent getDefaultInstance() {
            return MailTextContent.DEFAULT_INSTANCE;
        }
        
        public static Parser<MailTextContent> parser() {
            return MailTextContent.PARSER;
        }
        
        @Override
        public Parser<MailTextContent> getParserForType() {
            return MailTextContent.PARSER;
        }
        
        @Override
        public MailTextContent getDefaultInstanceForType() {
            return MailTextContent.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MailTextContent();
            PARSER = new AbstractParser<MailTextContent>() {
                @Override
                public MailTextContent parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MailTextContent(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MailTextContentOrBuilder
        {
            private Object title_;
            private Object content_;
            private Object sender_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MailTextContentOuterClass.internal_static_MailTextContent_fieldAccessorTable.ensureFieldAccessorsInitialized(MailTextContent.class, Builder.class);
            }
            
            private Builder() {
                this.title_ = "";
                this.content_ = "";
                this.sender_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.title_ = "";
                this.content_ = "";
                this.sender_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MailTextContent.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.title_ = "";
                this.content_ = "";
                this.sender_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
            }
            
            @Override
            public MailTextContent getDefaultInstanceForType() {
                return MailTextContent.getDefaultInstance();
            }
            
            @Override
            public MailTextContent build() {
                final MailTextContent result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MailTextContent buildPartial() {
                final MailTextContent result = new MailTextContent(this);
                result.title_ = this.title_;
                result.content_ = this.content_;
                result.sender_ = this.sender_;
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
                if (other instanceof MailTextContent) {
                    return this.mergeFrom((MailTextContent)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MailTextContent other) {
                if (other == MailTextContent.getDefaultInstance()) {
                    return this;
                }
                if (!other.getTitle().isEmpty()) {
                    this.title_ = other.title_;
                    this.onChanged();
                }
                if (!other.getContent().isEmpty()) {
                    this.content_ = other.content_;
                    this.onChanged();
                }
                if (!other.getSender().isEmpty()) {
                    this.sender_ = other.sender_;
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
                MailTextContent parsedMessage = null;
                try {
                    parsedMessage = MailTextContent.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MailTextContent)e.getUnfinishedMessage();
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
                this.title_ = MailTextContent.getDefaultInstance().getTitle();
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
            public String getContent() {
                final Object ref = this.content_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.content_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getContentBytes() {
                final Object ref = this.content_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.content_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setContent(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.content_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearContent() {
                this.content_ = MailTextContent.getDefaultInstance().getContent();
                this.onChanged();
                return this;
            }
            
            public Builder setContentBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.content_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getSender() {
                final Object ref = this.sender_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.sender_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getSenderBytes() {
                final Object ref = this.sender_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.sender_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setSender(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.sender_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSender() {
                this.sender_ = MailTextContent.getDefaultInstance().getSender();
                this.onChanged();
                return this;
            }
            
            public Builder setSenderBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.sender_ = value;
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
    
    public interface MailTextContentOrBuilder extends MessageOrBuilder
    {
        String getTitle();
        
        ByteString getTitleBytes();
        
        String getContent();
        
        ByteString getContentBytes();
        
        String getSender();
        
        ByteString getSenderBytes();
    }
}
