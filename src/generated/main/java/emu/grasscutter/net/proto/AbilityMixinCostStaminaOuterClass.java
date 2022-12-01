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
import com.google.protobuf.Internal;
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

public final class AbilityMixinCostStaminaOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityMixinCostStamina_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityMixinCostStamina_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityMixinCostStaminaOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityMixinCostStaminaOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dAbilityMixinCostStamina.proto\"*\n\u0017AbilityMixinCostStamina\u0012\u000f\n\u0007is_swim\u0018\u0003 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityMixinCostStaminaOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityMixinCostStamina_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityMixinCostStamina_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_descriptor, new String[] { "IsSwim" });
    }
    
    public static final class AbilityMixinCostStamina extends GeneratedMessageV3 implements AbilityMixinCostStaminaOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_SWIM_FIELD_NUMBER = 3;
        private boolean isSwim_;
        private byte memoizedIsInitialized;
        private static final AbilityMixinCostStamina DEFAULT_INSTANCE;
        private static final Parser<AbilityMixinCostStamina> PARSER;
        
        private AbilityMixinCostStamina(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityMixinCostStamina() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityMixinCostStamina();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityMixinCostStamina(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isSwim_ = input.readBool();
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
            return AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinCostStamina.class, Builder.class);
        }
        
        @Override
        public boolean getIsSwim() {
            return this.isSwim_;
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
            if (this.isSwim_) {
                output.writeBool(3, this.isSwim_);
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
            if (this.isSwim_) {
                size += CodedOutputStream.computeBoolSize(3, this.isSwim_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityMixinCostStamina)) {
                return super.equals(obj);
            }
            final AbilityMixinCostStamina other = (AbilityMixinCostStamina)obj;
            return this.getIsSwim() == other.getIsSwim() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSwim());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityMixinCostStamina parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinCostStamina parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinCostStamina parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinCostStamina parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinCostStamina parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data);
        }
        
        public static AbilityMixinCostStamina parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityMixinCostStamina.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityMixinCostStamina parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinCostStamina.PARSER, input);
        }
        
        public static AbilityMixinCostStamina parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinCostStamina.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinCostStamina parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinCostStamina.PARSER, input);
        }
        
        public static AbilityMixinCostStamina parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityMixinCostStamina.PARSER, input, extensionRegistry);
        }
        
        public static AbilityMixinCostStamina parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinCostStamina.PARSER, input);
        }
        
        public static AbilityMixinCostStamina parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityMixinCostStamina.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityMixinCostStamina.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityMixinCostStamina prototype) {
            return AbilityMixinCostStamina.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityMixinCostStamina.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityMixinCostStamina getDefaultInstance() {
            return AbilityMixinCostStamina.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityMixinCostStamina> parser() {
            return AbilityMixinCostStamina.PARSER;
        }
        
        @Override
        public Parser<AbilityMixinCostStamina> getParserForType() {
            return AbilityMixinCostStamina.PARSER;
        }
        
        @Override
        public AbilityMixinCostStamina getDefaultInstanceForType() {
            return AbilityMixinCostStamina.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityMixinCostStamina();
            PARSER = new AbstractParser<AbilityMixinCostStamina>() {
                @Override
                public AbilityMixinCostStamina parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityMixinCostStamina(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityMixinCostStaminaOrBuilder
        {
            private boolean isSwim_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityMixinCostStamina.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityMixinCostStamina.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isSwim_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityMixinCostStaminaOuterClass.internal_static_AbilityMixinCostStamina_descriptor;
            }
            
            @Override
            public AbilityMixinCostStamina getDefaultInstanceForType() {
                return AbilityMixinCostStamina.getDefaultInstance();
            }
            
            @Override
            public AbilityMixinCostStamina build() {
                final AbilityMixinCostStamina result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityMixinCostStamina buildPartial() {
                final AbilityMixinCostStamina result = new AbilityMixinCostStamina(this);
                result.isSwim_ = this.isSwim_;
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
                if (other instanceof AbilityMixinCostStamina) {
                    return this.mergeFrom((AbilityMixinCostStamina)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityMixinCostStamina other) {
                if (other == AbilityMixinCostStamina.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsSwim()) {
                    this.setIsSwim(other.getIsSwim());
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
                AbilityMixinCostStamina parsedMessage = null;
                try {
                    parsedMessage = AbilityMixinCostStamina.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityMixinCostStamina)e.getUnfinishedMessage();
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
            public boolean getIsSwim() {
                return this.isSwim_;
            }
            
            public Builder setIsSwim(final boolean value) {
                this.isSwim_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSwim() {
                this.isSwim_ = false;
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
    
    public interface AbilityMixinCostStaminaOrBuilder extends MessageOrBuilder
    {
        boolean getIsSwim();
    }
}
