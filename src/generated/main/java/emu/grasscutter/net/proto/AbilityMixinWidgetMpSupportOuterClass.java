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

public final class AbilityMixinWidgetMpSupportOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityMixinWidgetMpSupport_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityMixinWidgetMpSupport_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityMixinWidgetMpSupportOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityMixinWidgetMpSupportOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!AbilityMixinWidgetMpSupport.proto\"7\n\u001bAbilityMixinWidgetMpSupport\u0012\u0018\n\u0010target_entity_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityMixinWidgetMpSupportOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityMixinWidgetMpSupport_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityMixinWidgetMpSupport_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_descriptor, new String[] { "TargetEntityId" });
    }
    
    public static final class AbilityMixinWidgetMpSupport extends GeneratedMessageV3 implements AbilityMixinWidgetMpSupportOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 9;
        private int targetEntityId_;
        private byte memoizedIsInitialized;
        private static final AbilityMixinWidgetMpSupport DEFAULT_INSTANCE;
        private static final Parser<AbilityMixinWidgetMpSupport> PARSER;
        
        private AbilityMixinWidgetMpSupport(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityMixinWidgetMpSupport() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityMixinWidgetMpSupport();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityMixinWidgetMpSupport(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.targetEntityId_ = input.readUInt32();
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
            return AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinWidgetMpSupport.class, Builder.class);
        }
        
        @Override
        public int getTargetEntityId() {
            return this.targetEntityId_;
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
            if (this.targetEntityId_ != 0) {
                output.writeUInt32(9, this.targetEntityId_);
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
            if (this.targetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.targetEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityMixinWidgetMpSupport)) {
                return super.equals(obj);
            }
            final AbilityMixinWidgetMpSupport other = (AbilityMixinWidgetMpSupport)obj;
            return this.getTargetEntityId() == other.getTargetEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getTargetEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinWidgetMpSupport.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinWidgetMpSupport.PARSER, input);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinWidgetMpSupport.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinWidgetMpSupport parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinWidgetMpSupport.PARSER, input);
        }
        
        public static AbilityMixinWidgetMpSupport parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinWidgetMpSupport.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinWidgetMpSupport.PARSER, input);
        }
        
        public static AbilityMixinWidgetMpSupport parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinWidgetMpSupport.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityMixinWidgetMpSupport.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityMixinWidgetMpSupport prototype) {
            return AbilityMixinWidgetMpSupport.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityMixinWidgetMpSupport.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityMixinWidgetMpSupport getDefaultInstance() {
            return AbilityMixinWidgetMpSupport.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityMixinWidgetMpSupport> parser() {
            return AbilityMixinWidgetMpSupport.PARSER;
        }
        
        @Override
        public Parser<AbilityMixinWidgetMpSupport> getParserForType() {
            return AbilityMixinWidgetMpSupport.PARSER;
        }
        
        @Override
        public AbilityMixinWidgetMpSupport getDefaultInstanceForType() {
            return AbilityMixinWidgetMpSupport.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityMixinWidgetMpSupport();
            PARSER = new AbstractParser<AbilityMixinWidgetMpSupport>() {
                @Override
                public AbilityMixinWidgetMpSupport parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityMixinWidgetMpSupport(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityMixinWidgetMpSupportOrBuilder
        {
            private int targetEntityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinWidgetMpSupport.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityMixinWidgetMpSupport.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetEntityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityMixinWidgetMpSupportOuterClass.internal_static_AbilityMixinWidgetMpSupport_descriptor;
            }
            
            @Override
            public AbilityMixinWidgetMpSupport getDefaultInstanceForType() {
                return AbilityMixinWidgetMpSupport.getDefaultInstance();
            }
            
            @Override
            public AbilityMixinWidgetMpSupport build() {
                final AbilityMixinWidgetMpSupport result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityMixinWidgetMpSupport buildPartial() {
                final AbilityMixinWidgetMpSupport result = new AbilityMixinWidgetMpSupport(this);
                result.targetEntityId_ = this.targetEntityId_;
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
                if (other instanceof AbilityMixinWidgetMpSupport) {
                    return this.mergeFrom((AbilityMixinWidgetMpSupport)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityMixinWidgetMpSupport other) {
                if (other == AbilityMixinWidgetMpSupport.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetEntityId() != 0) {
                    this.setTargetEntityId(other.getTargetEntityId());
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
                AbilityMixinWidgetMpSupport parsedMessage = null;
                try {
                    parsedMessage = AbilityMixinWidgetMpSupport.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityMixinWidgetMpSupport)e.getUnfinishedMessage();
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
            public int getTargetEntityId() {
                return this.targetEntityId_;
            }
            
            public Builder setTargetEntityId(final int value) {
                this.targetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetEntityId() {
                this.targetEntityId_ = 0;
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
    
    public interface AbilityMixinWidgetMpSupportOrBuilder extends MessageOrBuilder
    {
        int getTargetEntityId();
    }
}
