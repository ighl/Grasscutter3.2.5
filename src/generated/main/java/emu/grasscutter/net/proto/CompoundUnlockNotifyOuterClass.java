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
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
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

public final class CompoundUnlockNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CompoundUnlockNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CompoundUnlockNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CompoundUnlockNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CompoundUnlockNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aCompoundUnlockNotify.proto\"+\n\u0014CompoundUnlockNotify\u0012\u0013\n\u000bcompound_id\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CompoundUnlockNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CompoundUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CompoundUnlockNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_descriptor, new String[] { "CompoundId" });
    }
    
    public static final class CompoundUnlockNotify extends GeneratedMessageV3 implements CompoundUnlockNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMPOUND_ID_FIELD_NUMBER = 3;
        private int compoundId_;
        private byte memoizedIsInitialized;
        private static final CompoundUnlockNotify DEFAULT_INSTANCE;
        private static final Parser<CompoundUnlockNotify> PARSER;
        
        private CompoundUnlockNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CompoundUnlockNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CompoundUnlockNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CompoundUnlockNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.compoundId_ = input.readUInt32();
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
            return CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundUnlockNotify.class, Builder.class);
        }
        
        @Override
        public int getCompoundId() {
            return this.compoundId_;
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
            if (this.compoundId_ != 0) {
                output.writeUInt32(3, this.compoundId_);
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
            if (this.compoundId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.compoundId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CompoundUnlockNotify)) {
                return super.equals(obj);
            }
            final CompoundUnlockNotify other = (CompoundUnlockNotify)obj;
            return this.getCompoundId() == other.getCompoundId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCompoundId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CompoundUnlockNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundUnlockNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundUnlockNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundUnlockNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundUnlockNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static CompoundUnlockNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundUnlockNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundUnlockNotify.PARSER, input);
        }
        
        public static CompoundUnlockNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static CompoundUnlockNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundUnlockNotify.PARSER, input);
        }
        
        public static CompoundUnlockNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static CompoundUnlockNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundUnlockNotify.PARSER, input);
        }
        
        public static CompoundUnlockNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CompoundUnlockNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CompoundUnlockNotify prototype) {
            return CompoundUnlockNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CompoundUnlockNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CompoundUnlockNotify getDefaultInstance() {
            return CompoundUnlockNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CompoundUnlockNotify> parser() {
            return CompoundUnlockNotify.PARSER;
        }
        
        @Override
        public Parser<CompoundUnlockNotify> getParserForType() {
            return CompoundUnlockNotify.PARSER;
        }
        
        @Override
        public CompoundUnlockNotify getDefaultInstanceForType() {
            return CompoundUnlockNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CompoundUnlockNotify();
            PARSER = new AbstractParser<CompoundUnlockNotify>() {
                @Override
                public CompoundUnlockNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CompoundUnlockNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompoundUnlockNotifyOrBuilder
        {
            private int compoundId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundUnlockNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CompoundUnlockNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.compoundId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CompoundUnlockNotifyOuterClass.internal_static_CompoundUnlockNotify_descriptor;
            }
            
            @Override
            public CompoundUnlockNotify getDefaultInstanceForType() {
                return CompoundUnlockNotify.getDefaultInstance();
            }
            
            @Override
            public CompoundUnlockNotify build() {
                final CompoundUnlockNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CompoundUnlockNotify buildPartial() {
                final CompoundUnlockNotify result = new CompoundUnlockNotify(this);
                result.compoundId_ = this.compoundId_;
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
                if (other instanceof CompoundUnlockNotify) {
                    return this.mergeFrom((CompoundUnlockNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CompoundUnlockNotify other) {
                if (other == CompoundUnlockNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCompoundId() != 0) {
                    this.setCompoundId(other.getCompoundId());
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
                CompoundUnlockNotify parsedMessage = null;
                try {
                    parsedMessage = CompoundUnlockNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CompoundUnlockNotify)e.getUnfinishedMessage();
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
            public int getCompoundId() {
                return this.compoundId_;
            }
            
            public Builder setCompoundId(final int value) {
                this.compoundId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCompoundId() {
                this.compoundId_ = 0;
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
    
    public interface CompoundUnlockNotifyOrBuilder extends MessageOrBuilder
    {
        int getCompoundId();
    }
}
