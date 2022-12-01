// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
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

public final class PrivateChatReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PrivateChatReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PrivateChatReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PrivateChatReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PrivateChatReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014PrivateChatReq.proto\"O\n\u000ePrivateChatReq\u0012\u0012\n\ntarget_uid\u0018\n \u0001(\r\u0012\u000e\n\u0004text\u0018\f \u0001(\tH\u0000\u0012\u000e\n\u0004icon\u0018\u000e \u0001(\rH\u0000B\t\n\u0007contentB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PrivateChatReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PrivateChatReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PrivateChatReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor, new String[] { "TargetUid", "Text", "Icon", "Content" });
    }
    
    public static final class PrivateChatReq extends GeneratedMessageV3 implements PrivateChatReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int contentCase_;
        private Object content_;
        public static final int TARGET_UID_FIELD_NUMBER = 10;
        private int targetUid_;
        public static final int TEXT_FIELD_NUMBER = 12;
        public static final int ICON_FIELD_NUMBER = 14;
        private byte memoizedIsInitialized;
        private static final PrivateChatReq DEFAULT_INSTANCE;
        private static final Parser<PrivateChatReq> PARSER;
        
        private PrivateChatReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.contentCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private PrivateChatReq() {
            this.contentCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PrivateChatReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PrivateChatReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            final String s = input.readStringRequireUtf8();
                            this.contentCase_ = 12;
                            this.content_ = s;
                            continue;
                        }
                        case 112: {
                            this.contentCase_ = 14;
                            this.content_ = input.readUInt32();
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
            return PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PrivateChatReqOuterClass.internal_static_PrivateChatReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PrivateChatReq.class, Builder.class);
        }
        
        @Override
        public ContentCase getContentCase() {
            return ContentCase.forNumber(this.contentCase_);
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
        }
        
        @Override
        public boolean hasText() {
            return this.contentCase_ == 12;
        }
        
        @Override
        public String getText() {
            Object ref = "";
            if (this.contentCase_ == 12) {
                ref = this.content_;
            }
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            if (this.contentCase_ == 12) {
                this.content_ = s;
            }
            return s;
        }
        
        @Override
        public ByteString getTextBytes() {
            Object ref = "";
            if (this.contentCase_ == 12) {
                ref = this.content_;
            }
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                if (this.contentCase_ == 12) {
                    this.content_ = b;
                }
                return b;
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasIcon() {
            return this.contentCase_ == 14;
        }
        
        @Override
        public int getIcon() {
            if (this.contentCase_ == 14) {
                return (int)this.content_;
            }
            return 0;
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
                output.writeUInt32(10, this.targetUid_);
            }
            if (this.contentCase_ == 12) {
                GeneratedMessageV3.writeString(output, 12, this.content_);
            }
            if (this.contentCase_ == 14) {
                output.writeUInt32(14, (int)this.content_);
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
                size += CodedOutputStream.computeUInt32Size(10, this.targetUid_);
            }
            if (this.contentCase_ == 12) {
                size += GeneratedMessageV3.computeStringSize(12, this.content_);
            }
            if (this.contentCase_ == 14) {
                size += CodedOutputStream.computeUInt32Size(14, (int)this.content_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PrivateChatReq)) {
                return super.equals(obj);
            }
            final PrivateChatReq other = (PrivateChatReq)obj;
            if (this.getTargetUid() != other.getTargetUid()) {
                return false;
            }
            if (!this.getContentCase().equals(other.getContentCase())) {
                return false;
            }
            switch (this.contentCase_) {
                case 12: {
                    if (!this.getText().equals(other.getText())) {
                        return false;
                    }
                    break;
                }
                case 14: {
                    if (this.getIcon() != other.getIcon()) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getTargetUid();
            switch (this.contentCase_) {
                case 12: {
                    hash = 37 * hash + 12;
                    hash = 53 * hash + this.getText().hashCode();
                    break;
                }
                case 14: {
                    hash = 37 * hash + 14;
                    hash = 53 * hash + this.getIcon();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PrivateChatReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data);
        }
        
        public static PrivateChatReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PrivateChatReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data);
        }
        
        public static PrivateChatReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PrivateChatReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data);
        }
        
        public static PrivateChatReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PrivateChatReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PrivateChatReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PrivateChatReq.PARSER, input);
        }
        
        public static PrivateChatReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PrivateChatReq.PARSER, input, extensionRegistry);
        }
        
        public static PrivateChatReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PrivateChatReq.PARSER, input);
        }
        
        public static PrivateChatReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PrivateChatReq.PARSER, input, extensionRegistry);
        }
        
        public static PrivateChatReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PrivateChatReq.PARSER, input);
        }
        
        public static PrivateChatReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PrivateChatReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PrivateChatReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PrivateChatReq prototype) {
            return PrivateChatReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PrivateChatReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PrivateChatReq getDefaultInstance() {
            return PrivateChatReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PrivateChatReq> parser() {
            return PrivateChatReq.PARSER;
        }
        
        @Override
        public Parser<PrivateChatReq> getParserForType() {
            return PrivateChatReq.PARSER;
        }
        
        @Override
        public PrivateChatReq getDefaultInstanceForType() {
            return PrivateChatReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PrivateChatReq();
            PARSER = new AbstractParser<PrivateChatReq>() {
                @Override
                public PrivateChatReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PrivateChatReq(input, extensionRegistry);
                }
            };
        }
        
        public enum ContentCase implements Internal.EnumLite, InternalOneOfEnum
        {
            TEXT(12), 
            ICON(14), 
            CONTENT_NOT_SET(0);
            
            private final int value;
            
            private ContentCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ContentCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ContentCase forNumber(final int value) {
                switch (value) {
                    case 12: {
                        return ContentCase.TEXT;
                    }
                    case 14: {
                        return ContentCase.ICON;
                    }
                    case 0: {
                        return ContentCase.CONTENT_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ContentCase[] value() {
                return new ContentCase[] { ContentCase.TEXT, ContentCase.ICON, ContentCase.CONTENT_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PrivateChatReqOrBuilder
        {
            private int contentCase_;
            private Object content_;
            private int targetUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PrivateChatReqOuterClass.internal_static_PrivateChatReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PrivateChatReq.class, Builder.class);
            }
            
            private Builder() {
                this.contentCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.contentCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PrivateChatReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetUid_ = 0;
                this.contentCase_ = 0;
                this.content_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PrivateChatReqOuterClass.internal_static_PrivateChatReq_descriptor;
            }
            
            @Override
            public PrivateChatReq getDefaultInstanceForType() {
                return PrivateChatReq.getDefaultInstance();
            }
            
            @Override
            public PrivateChatReq build() {
                final PrivateChatReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PrivateChatReq buildPartial() {
                final PrivateChatReq result = new PrivateChatReq(this);
                result.targetUid_ = this.targetUid_;
                if (this.contentCase_ == 12) {
                    result.content_ = this.content_;
                }
                if (this.contentCase_ == 14) {
                    result.content_ = this.content_;
                }
                result.contentCase_ = this.contentCase_;
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
                if (other instanceof PrivateChatReq) {
                    return this.mergeFrom((PrivateChatReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PrivateChatReq other) {
                if (other == PrivateChatReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
                }
                switch (other.getContentCase()) {
                    case TEXT: {
                        this.contentCase_ = 12;
                        this.content_ = other.content_;
                        this.onChanged();
                        break;
                    }
                    case ICON: {
                        this.setIcon(other.getIcon());
                        break;
                    }
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
                PrivateChatReq parsedMessage = null;
                try {
                    parsedMessage = PrivateChatReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PrivateChatReq)e.getUnfinishedMessage();
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
            public ContentCase getContentCase() {
                return ContentCase.forNumber(this.contentCase_);
            }
            
            public Builder clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
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
            public boolean hasText() {
                return this.contentCase_ == 12;
            }
            
            @Override
            public String getText() {
                Object ref = "";
                if (this.contentCase_ == 12) {
                    ref = this.content_;
                }
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    if (this.contentCase_ == 12) {
                        this.content_ = s;
                    }
                    return s;
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getTextBytes() {
                Object ref = "";
                if (this.contentCase_ == 12) {
                    ref = this.content_;
                }
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    if (this.contentCase_ == 12) {
                        this.content_ = b;
                    }
                    return b;
                }
                return (ByteString)ref;
            }
            
            public Builder setText(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.contentCase_ = 12;
                this.content_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearText() {
                if (this.contentCase_ == 12) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            public Builder setTextBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.contentCase_ = 12;
                this.content_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasIcon() {
                return this.contentCase_ == 14;
            }
            
            @Override
            public int getIcon() {
                if (this.contentCase_ == 14) {
                    return (int)this.content_;
                }
                return 0;
            }
            
            public Builder setIcon(final int value) {
                this.contentCase_ = 14;
                this.content_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIcon() {
                if (this.contentCase_ == 14) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                    this.onChanged();
                }
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
    
    public interface PrivateChatReqOrBuilder extends MessageOrBuilder
    {
        int getTargetUid();
        
        boolean hasText();
        
        String getText();
        
        ByteString getTextBytes();
        
        boolean hasIcon();
        
        int getIcon();
        
        PrivateChatReq.ContentCase getContentCase();
    }
}
