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

public final class CombatInvokeEntryOuterClass
{
    private static final Descriptors.Descriptor internal_static_CombatInvokeEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CombatInvokeEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CombatInvokeEntryOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombatInvokeEntryOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017CombatInvokeEntry.proto\u001a\u0018CombatTypeArgument.proto\u001a\u0011ForwardType.proto\"x\n\u0011CombatInvokeEntry\u0012\u0013\n\u000bcombat_data\u0018\r \u0001(\f\u0012\"\n\fforward_type\u0018\f \u0001(\u000e2\f.ForwardType\u0012*\n\rargument_type\u0018\u000e \u0001(\u000e2\u0013.CombatTypeArgumentB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombatInvokeEntryOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CombatTypeArgumentOuterClass.getDescriptor(), ForwardTypeOuterClass.getDescriptor() });
        internal_static_CombatInvokeEntry_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombatInvokeEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor, new String[] { "CombatData", "ForwardType", "ArgumentType" });
        CombatTypeArgumentOuterClass.getDescriptor();
        ForwardTypeOuterClass.getDescriptor();
    }
    
    public static final class CombatInvokeEntry extends GeneratedMessageV3 implements CombatInvokeEntryOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMBAT_DATA_FIELD_NUMBER = 13;
        private ByteString combatData_;
        public static final int FORWARD_TYPE_FIELD_NUMBER = 12;
        private int forwardType_;
        public static final int ARGUMENT_TYPE_FIELD_NUMBER = 14;
        private int argumentType_;
        private byte memoizedIsInitialized;
        private static final CombatInvokeEntry DEFAULT_INSTANCE;
        private static final Parser<CombatInvokeEntry> PARSER;
        
        private CombatInvokeEntry(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CombatInvokeEntry() {
            this.memoizedIsInitialized = -1;
            this.combatData_ = ByteString.EMPTY;
            this.forwardType_ = 0;
            this.argumentType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CombatInvokeEntry();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CombatInvokeEntry(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            final int rawValue = input.readEnum();
                            this.forwardType_ = rawValue;
                            continue;
                        }
                        case 106: {
                            this.combatData_ = input.readBytes();
                            continue;
                        }
                        case 112: {
                            final int rawValue = input.readEnum();
                            this.argumentType_ = rawValue;
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
            return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(CombatInvokeEntry.class, Builder.class);
        }
        
        @Override
        public ByteString getCombatData() {
            return this.combatData_;
        }
        
        @Override
        public int getForwardTypeValue() {
            return this.forwardType_;
        }
        
        @Override
        public ForwardTypeOuterClass.ForwardType getForwardType() {
            final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
            return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getArgumentTypeValue() {
            return this.argumentType_;
        }
        
        @Override
        public CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
            final CombatTypeArgumentOuterClass.CombatTypeArgument result = CombatTypeArgumentOuterClass.CombatTypeArgument.valueOf(this.argumentType_);
            return (result == null) ? CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
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
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                output.writeEnum(12, this.forwardType_);
            }
            if (!this.combatData_.isEmpty()) {
                output.writeBytes(13, this.combatData_);
            }
            if (this.argumentType_ != CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
                output.writeEnum(14, this.argumentType_);
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
            if (this.forwardType_ != ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
                size += CodedOutputStream.computeEnumSize(12, this.forwardType_);
            }
            if (!this.combatData_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(13, this.combatData_);
            }
            if (this.argumentType_ != CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(14, this.argumentType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CombatInvokeEntry)) {
                return super.equals(obj);
            }
            final CombatInvokeEntry other = (CombatInvokeEntry)obj;
            return this.getCombatData().equals(other.getCombatData()) && this.forwardType_ == other.forwardType_ && this.argumentType_ == other.argumentType_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCombatData().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.forwardType_;
            hash = 37 * hash + 14;
            hash = 53 * hash + this.argumentType_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CombatInvokeEntry parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static CombatInvokeEntry parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombatInvokeEntry parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static CombatInvokeEntry parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombatInvokeEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data);
        }
        
        public static CombatInvokeEntry parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombatInvokeEntry.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombatInvokeEntry parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombatInvokeEntry.PARSER, input);
        }
        
        public static CombatInvokeEntry parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombatInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        public static CombatInvokeEntry parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombatInvokeEntry.PARSER, input);
        }
        
        public static CombatInvokeEntry parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombatInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        public static CombatInvokeEntry parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombatInvokeEntry.PARSER, input);
        }
        
        public static CombatInvokeEntry parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombatInvokeEntry.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CombatInvokeEntry.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CombatInvokeEntry prototype) {
            return CombatInvokeEntry.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CombatInvokeEntry.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CombatInvokeEntry getDefaultInstance() {
            return CombatInvokeEntry.DEFAULT_INSTANCE;
        }
        
        public static Parser<CombatInvokeEntry> parser() {
            return CombatInvokeEntry.PARSER;
        }
        
        @Override
        public Parser<CombatInvokeEntry> getParserForType() {
            return CombatInvokeEntry.PARSER;
        }
        
        @Override
        public CombatInvokeEntry getDefaultInstanceForType() {
            return CombatInvokeEntry.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CombatInvokeEntry();
            PARSER = new AbstractParser<CombatInvokeEntry>() {
                @Override
                public CombatInvokeEntry parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CombatInvokeEntry(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CombatInvokeEntryOrBuilder
        {
            private ByteString combatData_;
            private int forwardType_;
            private int argumentType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable.ensureFieldAccessorsInitialized(CombatInvokeEntry.class, Builder.class);
            }
            
            private Builder() {
                this.combatData_ = ByteString.EMPTY;
                this.forwardType_ = 0;
                this.argumentType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.combatData_ = ByteString.EMPTY;
                this.forwardType_ = 0;
                this.argumentType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CombatInvokeEntry.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.combatData_ = ByteString.EMPTY;
                this.forwardType_ = 0;
                this.argumentType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
            }
            
            @Override
            public CombatInvokeEntry getDefaultInstanceForType() {
                return CombatInvokeEntry.getDefaultInstance();
            }
            
            @Override
            public CombatInvokeEntry build() {
                final CombatInvokeEntry result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CombatInvokeEntry buildPartial() {
                final CombatInvokeEntry result = new CombatInvokeEntry(this);
                result.combatData_ = this.combatData_;
                result.forwardType_ = this.forwardType_;
                result.argumentType_ = this.argumentType_;
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
                if (other instanceof CombatInvokeEntry) {
                    return this.mergeFrom((CombatInvokeEntry)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CombatInvokeEntry other) {
                if (other == CombatInvokeEntry.getDefaultInstance()) {
                    return this;
                }
                if (other.getCombatData() != ByteString.EMPTY) {
                    this.setCombatData(other.getCombatData());
                }
                if (other.forwardType_ != 0) {
                    this.setForwardTypeValue(other.getForwardTypeValue());
                }
                if (other.argumentType_ != 0) {
                    this.setArgumentTypeValue(other.getArgumentTypeValue());
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
                CombatInvokeEntry parsedMessage = null;
                try {
                    parsedMessage = CombatInvokeEntry.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CombatInvokeEntry)e.getUnfinishedMessage();
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
            public ByteString getCombatData() {
                return this.combatData_;
            }
            
            public Builder setCombatData(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.combatData_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombatData() {
                this.combatData_ = CombatInvokeEntry.getDefaultInstance().getCombatData();
                this.onChanged();
                return this;
            }
            
            @Override
            public int getForwardTypeValue() {
                return this.forwardType_;
            }
            
            public Builder setForwardTypeValue(final int value) {
                this.forwardType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ForwardTypeOuterClass.ForwardType getForwardType() {
                final ForwardTypeOuterClass.ForwardType result = ForwardTypeOuterClass.ForwardType.valueOf(this.forwardType_);
                return (result == null) ? ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
            }
            
            public Builder setForwardType(final ForwardTypeOuterClass.ForwardType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.forwardType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearForwardType() {
                this.forwardType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getArgumentTypeValue() {
                return this.argumentType_;
            }
            
            public Builder setArgumentTypeValue(final int value) {
                this.argumentType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
                final CombatTypeArgumentOuterClass.CombatTypeArgument result = CombatTypeArgumentOuterClass.CombatTypeArgument.valueOf(this.argumentType_);
                return (result == null) ? CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
            }
            
            public Builder setArgumentType(final CombatTypeArgumentOuterClass.CombatTypeArgument value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.argumentType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearArgumentType() {
                this.argumentType_ = 0;
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
    
    public interface CombatInvokeEntryOrBuilder extends MessageOrBuilder
    {
        ByteString getCombatData();
        
        int getForwardTypeValue();
        
        ForwardTypeOuterClass.ForwardType getForwardType();
        
        int getArgumentTypeValue();
        
        CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType();
    }
}
