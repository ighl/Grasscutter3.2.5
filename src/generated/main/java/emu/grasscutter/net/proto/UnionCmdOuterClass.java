// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class UnionCmdOuterClass
{
    private static final Descriptors.Descriptor internal_static_UnionCmd_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_UnionCmd_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private UnionCmdOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return UnionCmdOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eUnionCmd.proto\",\n\bUnionCmd\u0012\f\n\u0004body\u0018\t \u0001(\f\u0012\u0012\n\nmessage_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        UnionCmdOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_UnionCmd_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_UnionCmd_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(UnionCmdOuterClass.internal_static_UnionCmd_descriptor, new String[] { "Body", "MessageId" });
    }
    
    public static final class UnionCmd extends GeneratedMessageV3 implements UnionCmdOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BODY_FIELD_NUMBER = 9;
        private ByteString body_;
        public static final int MESSAGE_ID_FIELD_NUMBER = 15;
        private int messageId_;
        private byte memoizedIsInitialized;
        private static final UnionCmd DEFAULT_INSTANCE;
        private static final Parser<UnionCmd> PARSER;
        
        private UnionCmd(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private UnionCmd() {
            this.memoizedIsInitialized = -1;
            this.body_ = ByteString.EMPTY;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new UnionCmd();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private UnionCmd(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 74: {
                            this.body_ = input.readBytes();
                            continue;
                        }
                        case 120: {
                            this.messageId_ = input.readUInt32();
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
            return UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionCmdOuterClass.internal_static_UnionCmd_fieldAccessorTable.ensureFieldAccessorsInitialized(UnionCmd.class, Builder.class);
        }
        
        @Override
        public ByteString getBody() {
            return this.body_;
        }
        
        @Override
        public int getMessageId() {
            return this.messageId_;
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
            if (!this.body_.isEmpty()) {
                output.writeBytes(9, this.body_);
            }
            if (this.messageId_ != 0) {
                output.writeUInt32(15, this.messageId_);
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
            if (!this.body_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(9, this.body_);
            }
            if (this.messageId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.messageId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UnionCmd)) {
                return super.equals(obj);
            }
            final UnionCmd other = (UnionCmd)obj;
            return this.getBody().equals(other.getBody()) && this.getMessageId() == other.getMessageId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getBody().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getMessageId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static UnionCmd parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data);
        }
        
        public static UnionCmd parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnionCmd parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data);
        }
        
        public static UnionCmd parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnionCmd parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data);
        }
        
        public static UnionCmd parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return UnionCmd.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static UnionCmd parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnionCmd.PARSER, input);
        }
        
        public static UnionCmd parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnionCmd.PARSER, input, extensionRegistry);
        }
        
        public static UnionCmd parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnionCmd.PARSER, input);
        }
        
        public static UnionCmd parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(UnionCmd.PARSER, input, extensionRegistry);
        }
        
        public static UnionCmd parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnionCmd.PARSER, input);
        }
        
        public static UnionCmd parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(UnionCmd.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return UnionCmd.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final UnionCmd prototype) {
            return UnionCmd.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == UnionCmd.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static UnionCmd getDefaultInstance() {
            return UnionCmd.DEFAULT_INSTANCE;
        }
        
        public static Parser<UnionCmd> parser() {
            return UnionCmd.PARSER;
        }
        
        @Override
        public Parser<UnionCmd> getParserForType() {
            return UnionCmd.PARSER;
        }
        
        @Override
        public UnionCmd getDefaultInstanceForType() {
            return UnionCmd.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new UnionCmd();
            PARSER = new AbstractParser<UnionCmd>() {
                @Override
                public UnionCmd parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new UnionCmd(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnionCmdOrBuilder
        {
            private ByteString body_;
            private int messageId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return UnionCmdOuterClass.internal_static_UnionCmd_fieldAccessorTable.ensureFieldAccessorsInitialized(UnionCmd.class, Builder.class);
            }
            
            private Builder() {
                this.body_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.body_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (UnionCmd.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.body_ = ByteString.EMPTY;
                this.messageId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
            }
            
            @Override
            public UnionCmd getDefaultInstanceForType() {
                return UnionCmd.getDefaultInstance();
            }
            
            @Override
            public UnionCmd build() {
                final UnionCmd result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public UnionCmd buildPartial() {
                final UnionCmd result = new UnionCmd(this);
                result.body_ = this.body_;
                result.messageId_ = this.messageId_;
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
                if (other instanceof UnionCmd) {
                    return this.mergeFrom((UnionCmd)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final UnionCmd other) {
                if (other == UnionCmd.getDefaultInstance()) {
                    return this;
                }
                if (other.getBody() != ByteString.EMPTY) {
                    this.setBody(other.getBody());
                }
                if (other.getMessageId() != 0) {
                    this.setMessageId(other.getMessageId());
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
                UnionCmd parsedMessage = null;
                try {
                    parsedMessage = UnionCmd.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UnionCmd)e.getUnfinishedMessage();
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
            public ByteString getBody() {
                return this.body_;
            }
            
            public Builder setBody(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.body_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBody() {
                this.body_ = UnionCmd.getDefaultInstance().getBody();
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMessageId() {
                return this.messageId_;
            }
            
            public Builder setMessageId(final int value) {
                this.messageId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMessageId() {
                this.messageId_ = 0;
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
    
    public interface UnionCmdOrBuilder extends MessageOrBuilder
    {
        ByteString getBody();
        
        int getMessageId();
    }
}
